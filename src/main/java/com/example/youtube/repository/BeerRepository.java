package com.example.youtube.repository;

import com.example.youtube.models.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.mongodb.repository.MongoRepository;

@RepositoryRestResource
public interface BeerRepository extends CrudRepository<Beer,Long> {
}
