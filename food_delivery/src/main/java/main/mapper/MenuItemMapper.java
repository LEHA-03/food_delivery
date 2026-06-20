package main.mapper;

import org.springframework.stereotype.Component;

import main.dto.MenuItemDTO;
import main.model.MenuItem;

@Component
public class MenuItemMapper {

	public MenuItemMapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MenuItemDTO mapToDto(MenuItem menuItem) {
		MenuItemDTO dto = new MenuItemDTO();
		dto.setId(menuItem.getId());
		dto.setName(menuItem.getName());
		dto.setDescription(menuItem.getDescription());
		dto.setIngredients(menuItem.getIngredients());
		return dto;
	}

	
	public MenuItem mapToEntity(MenuItemDTO menuItemDTO) {
		MenuItem entity = new MenuItem();
		entity.setId(menuItemDTO.getId());
		entity.setName(menuItemDTO.getName());
		entity.setDescription(menuItemDTO.getDescription());
		entity.setIngredients(menuItemDTO.getIngredients());
		return entity;
	}
}
