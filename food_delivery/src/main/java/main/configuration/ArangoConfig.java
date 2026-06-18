package main.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import com.arangodb.ArangoDB;
import com.arangodb.springframework.annotation.EnableArangoRepositories;
import com.arangodb.springframework.config.ArangoConfiguration;

@Configuration
@EnableArangoRepositories(basePackages = "main.repository")
public class ArangoConfig implements ArangoConfiguration {

    @Value("${arangodb.host}")
    private String host;

    @Value("${arangodb.port}")
    private Integer port;

    @Value("${arangodb.user}")
    private String user;

    @Value("${arangodb.password}")
    private String password;

    @Value("${arangodb.database}")
    private String database;

    @Override
    public ArangoDB.Builder arango() {
        return new ArangoDB.Builder()
                .host(host, port)
                .user(user)
                .password(password);
    }

    @Override
    public String database() {
        return database;
    }
}