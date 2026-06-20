package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.OrderDTO;
import main.mapper.OrderMapper;
import main.model.Order;
import main.repository.OrderRepository;

@Service
public class OrderService {

	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderMapper orderMapper;
	
	

	public List<OrderDTO> findAll() {
		List<Order> entitys = (List<Order>) orderRepository.findAll();
		return entitys.stream()
				.map(orderMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public OrderDTO findById(String id) {

    	Order entity = orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));

        return orderMapper.mapToDto(entity);
    }
    
    
    public OrderDTO save(OrderDTO dto) {
    	Order entity = orderMapper.mapToEntity(dto);
    	Order saved = orderRepository.save(entity);
		return orderMapper.mapToDto(saved);
	}
    
    public void deleteUser(String id) {
    	orderRepository.deleteById(id);
	}
    
    public OrderDTO update(String id, OrderDTO menuItemDTO) {
    	OrderDTO dto = findById(id);

    	
    	Order entity = orderMapper.mapToEntity(dto);
    	Order updated = orderRepository.save(entity);
    	return orderMapper.mapToDto(updated);
    	
    }
	
		
}
