package main.dto;

public class ContainsDTO {


	    private String id;

	    private OrderDTO order;

	    private OffersDTO item;

	    private int quantity;

		public ContainsDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ContainsDTO(String id, OrderDTO order, OffersDTO item, int quantity) {
			super();
			this.id = id;
			this.order = order;
			this.item = item;
			this.quantity = quantity;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public OrderDTO getOrder() {
			return order;
		}

		public void setOrder(OrderDTO order) {
			this.order = order;
		}

		public OffersDTO getItem() {
			return item;
		}

		public void setItem(OffersDTO item) {
			this.item = item;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	    
	    
	    
	    
	    
}
