package main.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.Restaurant;

@Repository
public interface RestaurantRepository extends ArangoRepository<Restaurant, String> {


		Optional<Restaurant> findByName(String name);

	
}