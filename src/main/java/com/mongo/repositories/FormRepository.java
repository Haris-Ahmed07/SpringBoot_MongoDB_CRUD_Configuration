package com.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.models.Form;

public interface FormRepository extends MongoRepository<Form, Integer>{

}
