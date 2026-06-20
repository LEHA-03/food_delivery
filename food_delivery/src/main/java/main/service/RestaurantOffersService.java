package main.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dto.RestaurantOffersDTO;
import main.mapper.RestaurantOffersMapper;
import main.model.RestaurantOffers;
import main.repository.RestaurantOffersRepository;

@Service
public class RestaurantOffersService {

    @Autowired
    private RestaurantOffersRepository restaurantOffersRepository;

    @Autowired
    private RestaurantOffersMapper restaurantOffersMapper;

    public List<RestaurantOffersDTO> findAll() {
        List<RestaurantOffers> entities =
                (List<RestaurantOffers>) restaurantOffersRepository.findAll();

        return entities.stream()
                .map(restaurantOffersMapper::mapToDto)
                .collect(Collectors.toList());
    }

    public RestaurantOffersDTO findById(String id) {

        RestaurantOffers entity = restaurantOffersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("RestaurantOffers not found"));

        return restaurantOffersMapper.mapToDto(entity);
    }

    public RestaurantOffersDTO save(RestaurantOffersDTO dto) {
        RestaurantOffers entity = restaurantOffersMapper.mapToEntity(dto);
        RestaurantOffers saved = restaurantOffersRepository.save(entity);
        return restaurantOffersMapper.mapToDto(saved);
    }

    public void delete(String id) {
        restaurantOffersRepository.deleteById(id);
    }

    public RestaurantOffersDTO update(String id, RestaurantOffersDTO dto) {

        RestaurantOffers existing = restaurantOffersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("RestaurantOffers not found"));

        RestaurantOffers entity = restaurantOffersMapper.mapToEntity(dto);
        entity.setId(existing.getId());

        RestaurantOffers updated = restaurantOffersRepository.save(entity);

        return restaurantOffersMapper.mapToDto(updated);
    }
}