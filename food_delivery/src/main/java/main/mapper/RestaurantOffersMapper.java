package main.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dto.OfferDTO;
import main.dto.RestaurantDTO;
import main.dto.RestaurantOffersDTO;
import main.model.Offer;
import main.model.Restaurant;
import main.model.RestaurantOffers;
import main.service.OfferService;
import main.service.RestaurantService;

@Component
public class RestaurantOffersMapper {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private OfferService offerService;

    public RestaurantOffersDTO mapToDto(RestaurantOffers entity) {

        RestaurantOffersDTO dto = new RestaurantOffersDTO();
        dto.setId(entity.getId());

        RestaurantDTO restaurantDTO =
                restaurantService.findById(entity.getRestaurant().getId());

        OfferDTO offerDTO =
                offerService.findById(entity.getOffer().getId());

        dto.setRestaurant(restaurantDTO);
        dto.setOffer(offerDTO);

        return dto;
    }

    public RestaurantOffers mapToEntity(RestaurantOffersDTO dto) {

        RestaurantOffers entity = new RestaurantOffers();
        entity.setId(dto.getId());

        Restaurant r = new Restaurant();
        r.setId(dto.getRestaurant().getId());
        entity.setRestaurant(r);

        Offer o = new Offer();
        o.setId(dto.getOffer().getId());
        entity.setOffer(o);

        return entity;
    }
}