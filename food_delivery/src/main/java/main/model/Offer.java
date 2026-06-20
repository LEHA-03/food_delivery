package main.model;

import com.arangodb.serde.jackson.Id;
import com.arangodb.springframework.annotation.Document;

@Document("offers")
public class Offer {

    @Id
    private String id;

    private String restaurantId;
    private String menuItemId;

    private int price;

	public Offer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Offer(String id, String restaurantId, String menuItemId, int price) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.menuItemId = menuItemId;
		this.price = price;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getRestaurantId() {
		return restaurantId;
	}


	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}


	public String getMenuItemId() {
		return menuItemId;
	}


	public void setMenuItemId(String menuItemId) {
		this.menuItemId = menuItemId;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
    
}
