package main.mapper;

import org.springframework.stereotype.Component;

import main.dto.RestaurantDTO;
import main.model.Restaurant;

@Component
public class RestaurantMapper {

	public RestaurantMapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantDTO mapToDto(Restaurant entity) {
		if (entity == null) {
			return null;
		}
		RestaurantDTO dto = new RestaurantDTO();
		dto.setId(entity.getId());
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		
		return dto;
	}
	
	public Restaurant mapToEntity(RestaurantDTO dto) {
		if (dto == null) {
			return null;
		}
		Restaurant entity = new Restaurant();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setAddress(dto.getAddress());
		
		return entity;
	}
}
