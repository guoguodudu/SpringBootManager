package com.phdua.manager.mongodb.dao;

import com.phdua.manager.mongodb.domain.City;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends ReactiveMongoRepository<City, Long> {

}
