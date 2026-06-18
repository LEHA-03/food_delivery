package main.dto;

public class PlacedDTO {

    private String id;

    private UserDTO user;

    private OrderDTO order;

	public PlacedDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlacedDTO(String id, UserDTO user, OrderDTO order) {
		super();
		this.id = id;
		this.user = user;
		this.order = order;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}
    
    
}
