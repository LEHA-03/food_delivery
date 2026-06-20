package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.RestaurantOffers;

@Repository
public interface RestaurantOffersRepository extends ArangoRepository<RestaurantOffers, String> {
}