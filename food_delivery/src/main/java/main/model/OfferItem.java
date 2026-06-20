package main.model;

import org.springframework.data.annotation.Id;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.From;
import com.arangodb.springframework.annotation.To;

@Edge("offerItem")
public class OfferItem {

    @Id
    private String id;

    @From
    private Offer offer;

    @To
    private MenuItem item;

	public OfferItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OfferItem(String id, Offer offer, MenuItem item) {
		super();
		this.id = id;
		this.offer = offer;
		this.item = item;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public MenuItem getItem() {
		return item;
	}

	public void setItem(MenuItem item) {
		this.item = item;
	}
    
    
}
