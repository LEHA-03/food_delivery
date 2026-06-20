package main.model;

import com.arangodb.serde.jackson.Id;
import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;

@Edge("restaurantOffers")
public class RestaurantOffers {

    @Id
    private String id;

    @From
    private Restaurant restaurant;

    @To
    private Offer offer;

    public RestaurantOffers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantOffers(String id, Restaurant restaurant, Offer offer) {
		super();
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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
	
	

}
