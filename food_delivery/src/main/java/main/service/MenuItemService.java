package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.MenuItemDTO;
import main.mapper.MenuItemMapper;
import main.model.MenuItem;
import main.repository.MenuItemRepository;

@Service
public class MenuItemService {
	
	@Autowired
	private MenuItemRepository menuItemRepository;
	
	@Autowired
	private MenuItemMapper menuItemMapper;
	

	public List<MenuItemDTO> findAll() {
		List<MenuItem> entitys = (List<MenuItem>) menuItemRepository.findAll();
		return entitys.stream()
				.map(menuItemMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public MenuItemDTO findById(String id) {

    	MenuItem entity = menuItemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Menu Item not found"));

        return menuItemMapper.mapToDto(entity);
    }
    
    
    public MenuItemDTO save(MenuItemDTO dto) {
    	MenuItem entity = menuItemMapper.mapToEntity(dto);
    	MenuItem saved = menuItemRepository.save(entity);
		return menuItemMapper.mapToDto(saved);
	}
    
    public void deleteUser(String id) {
    	menuItemRepository.deleteById(id);
	}
    
    public MenuItemDTO update(String id, MenuItemDTO menuItemDTO) {
    	MenuItemDTO dto = findById(id);

    	
    	MenuItem entity = menuItemMapper.mapToEntity(dto);
    	MenuItem updated = menuItemRepository.save(entity);
    	return menuItemMapper.mapToDto(updated);
    	
    }

}
