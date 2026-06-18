package main.model;

import com.arangodb.serde.jackson.Id;
import com.arangodb.springframework.annotation.Document;

@Document("orders")
public class Order {

    @Id
    private String id;

    private String status;   
    private String userId;

    private double totalPrice;
    private long createdAt;
	
    public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(String id, String status, String userId, double totalPrice, long createdAt) {
		super();
		this.id = id;
		this.status = status;
		this.userId = userId;
		this.totalPrice = totalPrice;
		this.createdAt = createdAt;
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

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}
    
    
    
}
