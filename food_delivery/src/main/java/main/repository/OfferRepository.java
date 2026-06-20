package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.Offer;

@Repository
public interface OfferRepository extends ArangoRepository<Offer, String> {

}
