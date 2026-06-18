package main.model;

import com.arangodb.serde.jackson.From;
import com.arangodb.serde.jackson.Id;
import com.arangodb.serde.jackson.To;
import com.arangodb.springframework.annotation.Edge;

@Edge("placed")
public class Placed {

    @Id
    private String id;

    @From
    private User user;

    @To
    private Order order;

	public Placed() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Placed(String id, User user, Order order) {
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
    
    
}
