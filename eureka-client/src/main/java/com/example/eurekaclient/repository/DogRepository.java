package com.example.eurekaclient.repository;

import com.example.eurekaclient.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}
