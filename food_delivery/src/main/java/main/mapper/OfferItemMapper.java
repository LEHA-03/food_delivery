package main.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dto.MenuItemDTO;
import main.dto.OfferDTO;
import main.dto.OfferItemDTO;
import main.model.MenuItem;
import main.model.Offer;
import main.model.OfferItem;
import main.service.MenuItemService;
import main.service.OfferService;

@Component
public class OfferItemMapper {

    @Autowired
    private OfferService offerService;

    @Autowired
    private MenuItemService menuItemService;

    public OfferItemDTO mapToDto(OfferItem entity) {

        OfferItemDTO dto = new OfferItemDTO();
        dto.setId(entity.getId());

        OfferDTO offerDTO = offerService.findById(entity.getOffer().getId());
        dto.setOffer(offerDTO);

        MenuItemDTO itemDTO = menuItemService.findById(entity.getItem().getId());
        dto.setItem(itemDTO);

        return dto;
    }

    public OfferItem mapToEntity(OfferItemDTO dto) {

        OfferItem entity = new OfferItem();
        entity.setId(dto.getId());

        Offer offer = new Offer();
        offer.setId(dto.getOffer().getId());
        entity.setOffer(offer);

        MenuItem item = new MenuItem();
        item.setId(dto.getItem().getId());
        entity.setItem(item);

        return entity;
    }
}