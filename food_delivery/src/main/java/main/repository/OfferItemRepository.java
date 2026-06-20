package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.OfferItem;

@Repository
public interface OfferItemRepository extends ArangoRepository<OfferItem, String> {
}