package com.findisaac.mongospring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * MongoApplicationConfig
 * <br>
 * <code>com.findisaac.mongospring.config.MongoApplicationConfig</code>
 * <br>
 *
 * @author Isaac Aderonmu
 * @since 15 April 2021
 */
@Configuration
@EnableMongoRepositories
public class MongoApplicationConfig extends AbstractMongoClientConfiguration {
    @Override
    protected String getDatabaseName() {
        return "bookstore";
    }
}
