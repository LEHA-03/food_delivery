package main.mapper;

import org.springframework.stereotype.Component;

import main.dto.OrderDTO;
import main.model.Order;

@Component
public class OrderMapper {

	public OrderMapper() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderDTO mapToDto(Order entity) {
		if (entity == null) {
			return null;
		}
		OrderDTO dto = new OrderDTO();
		dto.setId(entity.getId());
		dto.setTotalPrice(entity.getTotalPrice());
		dto.setStatus(entity.getStatus());
		dto.setUserId(entity.getUserId());

		dto.setItems(null);
		
		return dto;
	}
	
	public Order mapToEntity(OrderDTO dto) {
		if (dto == null) {
			return null;
		}
		Order entity = new Order();
		entity.setId(dto.getId());
		entity.setTotalPrice(dto.getTotalPrice());
		entity.setStatus(dto.getStatus());
		entity.setUserId(dto.getUserId());
		
		return entity;
	}
	
	
	
	

}
