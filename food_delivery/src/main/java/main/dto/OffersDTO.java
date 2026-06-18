package main.dto;



public class OffersDTO {

	

    private String id;

    private RestaurantDTO restaurant;

    private MenuItemDTO item;

    private int price;

	public OffersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OffersDTO(String id, RestaurantDTO restaurant, MenuItemDTO item, int price) {
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

	public RestaurantDTO getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantDTO restaurant) {
		this.restaurant = restaurant;
	}

	public MenuItemDTO getItem() {
		return item;
	}

	public void setItem(MenuItemDTO item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
    
}
