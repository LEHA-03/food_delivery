package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.PlacedDTO;
import main.mapper.PlacedMapper;
import main.model.Placed;
import main.repository.PlacedRepository;

@Service
public class PlacedService {

	@Autowired
	private PlacedRepository placedRepository;
	@Autowired
	private PlacedMapper placedMapper;
	


	public List<PlacedDTO> findAll() {
		List<Placed> entitys = (List<Placed>) placedRepository.findAll();
		return entitys.stream()
				.map(placedMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public PlacedDTO findById(String id) {

    	Placed entity = placedRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placed not found"));

        return placedMapper.mapToDto(entity);
    }
    
    
    public PlacedDTO save(PlacedDTO dto) {
    	Placed entity = placedMapper.mapToEntity(dto);
    	Placed saved = placedRepository.save(entity);
		return placedMapper.mapToDto(saved);
	}
    
    public void deleteUser(String id) {
    	placedRepository.deleteById(id);
	}
    
    public PlacedDTO update(String id, PlacedDTO menuItemDTO) {
    	PlacedDTO dto = findById(id);

    	
    	Placed entity = placedMapper.mapToEntity(dto);
    	Placed updated = placedRepository.save(entity);
    	return placedMapper.mapToDto(updated);
    	
    }
}
