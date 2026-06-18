package main.repository;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.Order;

@Repository
public interface OrderRepository extends ArangoRepository<Order, String> {

}