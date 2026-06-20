package main.dto;

public class OfferItemDTO {

    private String id;

    private OfferDTO offer;

    private MenuItemDTO item;

    public OfferItemDTO() {
    }

    public OfferItemDTO(String id, OfferDTO offer, MenuItemDTO item) {
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

    public OfferDTO getOffer() {
        return offer;
    }

    public void setOffer(OfferDTO offer) {
        this.offer = offer;
    }

    public MenuItemDTO getItem() {
        return item;
    }

    public void setItem(MenuItemDTO item) {
        this.item = item;
    }
}