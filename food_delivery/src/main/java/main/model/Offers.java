package main.model;

import com.arangodb.serde.jackson.From;
import com.arangodb.serde.jackson.Id;
import com.arangodb.serde.jackson.To;
import com.arangodb.springframework.annotation.Edge;

@Edge("offers")
public class Offers {

    @Id
    private String id;

    @From
    private Restaurant restaurant;

    @To
    private MenuItem item;

    private int price;

	public Offers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offers(String id, Restaurant restaurant, MenuItem item, int price) {
		super();
		this.id = id;
		this.restaurant = restaurant;
		this.item = item;
		this.price = price;
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

	public MenuItem getItem() {
		return item;
	}

	public void setItem(MenuItem item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
    
}
