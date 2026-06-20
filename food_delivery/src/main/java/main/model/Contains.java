package main.model;

import com.arangodb.serde.jackson.From;
import com.arangodb.serde.jackson.Id;
import com.arangodb.serde.jackson.To;
import com.arangodb.springframework.annotation.Edge;

@Edge("contains")
public class Contains {

    @Id
    private String id;

    @From
    private Order order;

    @To
    private Offer offer;

    private int quantity;
	
    public Contains() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contains(String id, Order order, Offer offer, int quantity) {
		super();
		this.id = id;
		this.order = order;
		this.offer = offer;
		this.quantity = quantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Offer getItem() {
		return offer;
	}

	public void setItem(Offer offer) {
		this.offer = offer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

    
    
}
