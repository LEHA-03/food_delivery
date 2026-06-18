package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.Placed;

@Repository
public interface PlacedRepository
        extends ArangoRepository<Placed, String> {

}
