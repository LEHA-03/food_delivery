package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.MenuItemDTO;
import main.dto.RestaurantDTO;
import main.mapper.RestaurantMapper;
import main.model.Restaurant;
import main.repository.RestaurantRepository;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@Autowired
	private RestaurantMapper restaurantMapper;
	


	public List<RestaurantDTO> findAll() {
		List<Restaurant> entitys = (List<Restaurant>) restaurantRepository.findAll();
		return entitys.stream()
				.map(restaurantMapper::mapToDto)
				.collect(Collectors.toList());
	}
	
    public RestaurantDTO findById(String id) {

    	Restaurant entity = restaurantRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Restaurant not found"));

        return restaurantMapper.mapToDto(entity);
    }
    
    
    public RestaurantDTO save(RestaurantDTO dto) {
    	Restaurant entity = restaurantMapper.mapToEntity(dto);
    	Restaurant saved = restaurantRepository.save(entity);
		return restaurantMapper.mapToDto(saved);
	}
    
    public void deleteUser(String id) {
    	restaurantRepository.deleteById(id);
	}
    
    public RestaurantDTO update(String id, MenuItemDTO menuItemDTO) {
    	RestaurantDTO dto = findById(id);

    	
    	Restaurant entity = restaurantMapper.mapToEntity(dto);
    	Restaurant updated = restaurantRepository.save(entity);
    	return restaurantMapper.mapToDto(updated);
    	
    }

}
