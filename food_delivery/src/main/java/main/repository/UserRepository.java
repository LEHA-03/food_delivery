package main.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.arangodb.springframework.repository.ArangoRepository;

import main.model.User;

@Repository
public interface UserRepository extends ArangoRepository<User, String> {

    Optional<User> findByUsername(String username);

}