package com.example.youtube.repository;

import com.example.youtube.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface UserRepository extends CrudRepository<User,Long>{
    List<User>findByLastname(@Param("name")String name);
}
