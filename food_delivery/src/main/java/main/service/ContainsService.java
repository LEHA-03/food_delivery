package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.ContainsDTO;
import main.mapper.ContainsMapper;
import main.model.Contains;
import main.repository.ContainsRepository;

@Service
public class ContainsService {

	
	@Autowired
	private ContainsRepository containsRepository;
	@Autowired
	private ContainsMapper containsMapper;
	

	public List<ContainsDTO> findAll() {
		List<Contains> entitys = (List<Contains>) containsRepository.findAll();
		return entitys.stream()
				.map(containsMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public ContainsDTO findById(String id) {

    	Contains entity = containsRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contains not found"));

        return containsMapper.mapToDto(entity);
    }
    
    
    public ContainsDTO save(ContainsDTO containsDTO) {
    	Contains entity = containsMapper.mapToEntity(containsDTO);
		Contains saved = containsRepository.save(entity);
		return containsMapper.mapToDto(saved);
	}
    
    public void deleteUser(String id) {
    	containsRepository.deleteById(id);
	}
    
    public ContainsDTO update(String id, ContainsDTO containsDTO) {
    	ContainsDTO dto = findById(id);

    	
    	Contains entity = containsMapper.mapToEntity(dto);
    	Contains updated = containsRepository.save(entity);
    	return containsMapper.mapToDto(updated);
    	
    }
}
