package main.mapper;

import org.springframework.stereotype.Component;

import main.dto.OrderDTO;
import main.dto.PlacedDTO;
import main.dto.UserDTO;
import main.model.Order;
import main.model.Placed;
import main.model.User;

@Component
public class PlacedMapper {

	public PlacedMapper() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PlacedDTO mapToDto(Placed entity) {
		if (entity == null) {
			return null;
		}
		PlacedDTO dto = new PlacedDTO();
		dto.setId(entity.getId());

		UserDTO userDTO = new UserDTO();
		userDTO.setId(entity.getUser().getId());
		dto.setUser(userDTO);
		
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setId(entity.getOrder().getId());
		orderDTO.setStatus(entity.getOrder().getStatus());
		orderDTO.setTotalPrice(entity.getOrder().getTotalPrice());
		dto.setOrder(orderDTO);
		
		return dto;
	}
	
	public Placed mapToEntity(PlacedDTO dto) {
		if (dto == null) {
			return null;
		}
		Placed entity = new Placed();
		entity.setId(dto.getId());

		User user = new User();
		user.setId(dto.getUser().getId());
		entity.setUser(user);
		
		Order order = new Order();
		order.setId(dto.getOrder().getId());
		entity.setOrder(order);
		
		return entity;
	}

}
