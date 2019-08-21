package com.mongodb.mongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.mongo.one.users;

public interface userRepo extends MongoRepository<users, String> {
	

}
