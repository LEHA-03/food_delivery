package main.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dto.ContainsDTO;
import main.dto.OrderDTO;
import main.model.Contains;
import main.model.Offer;
import main.model.Order;
import main.service.OfferService;

@Component
public class ContainsMapper {
	
	@Autowired
	private OfferService offerService;

	public ContainsMapper() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContainsDTO mapToDto(Contains contains) {
		
		ContainsDTO dto = new ContainsDTO();
		dto.setId(contains.getId());

		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setId(contains.getOrder().getId());
		orderDTO.setStatus(contains.getOrder().getStatus());
		orderDTO.setUserId(contains.getOrder().getUserId());
		orderDTO.setTotalPrice(contains.getOrder().getTotalPrice());
		
		dto.setOrder(orderDTO);
				
		dto.setItem(offerService.findById(contains.getItem().getId()));
		
		return dto;
	}
	
	public Contains mapToEntity(ContainsDTO containsDTO) {
		
		Contains entity = new Contains();
		entity.setId(containsDTO.getId());
		
		Order order = new Order();
		order.setId(containsDTO.getOrder().getId());
		entity.setOrder(order); 
		
		Offer item = new Offer();
		item.setId(containsDTO.getItem().getId());
		entity.setItem(item);
		
		entity.setQuantity(containsDTO.getQuantity());
		
		return entity;
	}
	
	

	
}
