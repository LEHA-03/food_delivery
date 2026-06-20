package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.OfferItemDTO;
import main.mapper.OfferItemMapper;
import main.model.OfferItem;
import main.repository.OfferItemRepository;

@Service
public class OfferItemService {

    @Autowired
    private OfferItemRepository offerItemRepository;

    @Autowired
    private OfferItemMapper offerItemMapper;

    public List<OfferItemDTO> findAll() {
        List<OfferItem> entities = (List<OfferItem>) offerItemRepository.findAll();

        return entities.stream()
                .map(offerItemMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public OfferItemDTO findById(String id) {

        OfferItem entity = offerItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("OfferItem not found"));

        return offerItemMapper.mapToDto(entity);
    }

    public OfferItemDTO save(OfferItemDTO dto) {
        OfferItem entity = offerItemMapper.mapToEntity(dto);
        OfferItem saved = offerItemRepository.save(entity);
        return offerItemMapper.mapToDto(saved);
    }

    public void delete(String id) {
        offerItemRepository.deleteById(id);
    }

    public OfferItemDTO update(String id, OfferItemDTO dto) {

        OfferItem existing = offerItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("OfferItem not found"));

        OfferItem entity = offerItemMapper.mapToEntity(dto);
        entity.setId(existing.getId());

        OfferItem updated = offerItemRepository.save(entity);

        return offerItemMapper.mapToDto(updated);
    }
}