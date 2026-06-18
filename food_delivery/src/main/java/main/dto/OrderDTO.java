package main.dto;

import java.util.List;

public class OrderDTO {

    private String id;
    private String status;
    private String userId;
    private double totalPrice;

    private List<ContainsDTO> items;

	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(String id, String status, String userId, double totalPrice,
			List<ContainsDTO> items) {
		super();
		this.id = id;
		this.status = status;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.items = items;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}



	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public List<ContainsDTO> getItems() {
		return items;
	}

	public void setItems(List<ContainsDTO> items) {
		this.items = items;
	}





}