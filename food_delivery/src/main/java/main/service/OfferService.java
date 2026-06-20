package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.OfferDTO;
import main.mapper.MenuItemMapper;
import main.mapper.OfferMapper;
import main.model.Offer;
import main.repository.OfferRepository;

@Service
public class OfferService {
	
	@Autowired
	private OfferRepository offersRepository;
	@Autowired
	private MenuItemMapper menuItemMapper;
	@Autowired
	private OfferMapper offersMapper;

	public OfferService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<OfferDTO> findAll() {
		List<Offer> entitys = (List<Offer>) offersRepository.findAll();
		return entitys.stream()
				.map(offersMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public OfferDTO findById(String id) {

    	Offer entity = offersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Offer not found"));

        return offersMapper.mapToDto(entity);
    }
    
    public OfferDTO save(OfferDTO dto) {
    	Offer entity = offersMapper.mapToEntity(dto);
    	Offer saved = offersRepository.save(entity);
		return offersMapper.mapToDto(saved);
	}
    
    public void deleteUser(String id) {
    	offersRepository.deleteById(id);
	}
    
    public OfferDTO update(String id, OfferDTO offersDTO) {
    	OfferDTO dto = findById(id);

    	
    	Offer entity = offersMapper.mapToEntity(dto);
    	Offer updated = offersRepository.save(entity);
    	return offersMapper.mapToDto(updated);
    	
    }
	
}
