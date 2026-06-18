package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.Offers;

@Repository
public interface OffersRepository extends ArangoRepository<Offers, String> {

}
