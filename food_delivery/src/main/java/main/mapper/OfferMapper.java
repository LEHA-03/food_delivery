package main.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dto.OfferDTO;
import main.dto.RestaurantDTO;
import main.model.Offer;
import main.model.Restaurant;
import main.service.MenuItemService;
import main.service.RestaurantService;

@Component
public class OfferMapper {

    @Autowired
    private MenuItemService menuItemService;

    @Autowired
    private RestaurantService restaurantService;

    public OfferDTO mapToDto(Offer entity) {

        OfferDTO dto = new OfferDTO();
        dto.setId(entity.getId());
        dto.setPrice(entity.getPrice());

        RestaurantDTO r = restaurantService.findById(entity.getRestaurantId());
        dto.setRestaurant(new RestaurantDTO(
                r.getId(),
                r.getName(),
                r.getAddress()
        ));

        dto.setItem(menuItemService.findById(entity.getMenuItemId()));

        return dto;
    }

    public Offer mapToEntity(OfferDTO dto) {

        Offer entity = new Offer();
        entity.setId(dto.getId());
        entity.setPrice(dto.getPrice());

        Restaurant r = new Restaurant();
        r.setId(dto.getRestaurant().getId());
        entity.setRestaurantId(r.getId());

        entity.setMenuItemId(dto.getItem().getId());

        return entity;
    }
}