package main.dto;

public class RestaurantOffersDTO {

    private String id;

    private RestaurantDTO restaurant;

    private OfferDTO offer;

    public RestaurantOffersDTO() {
    }

    public RestaurantOffersDTO(String id, RestaurantDTO restaurant, OfferDTO offer) {
        this.id = id;
        this.restaurant = restaurant;
        this.offer = offer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RestaurantDTO getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(RestaurantDTO restaurant) {
        this.restaurant = restaurant;
    }

    public OfferDTO getOffer() {
        return offer;
    }

    public void setOffer(OfferDTO offer) {
        this.offer = offer;
    }
}