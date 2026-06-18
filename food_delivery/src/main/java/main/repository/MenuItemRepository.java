package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.MenuItem;

@Repository
public interface MenuItemRepository extends ArangoRepository<MenuItem, String> {

}