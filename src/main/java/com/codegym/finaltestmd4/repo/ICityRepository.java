package com.codegym.finaltestmd4.repo;

import com.codegym.finaltestmd4.model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICityRepository extends CrudRepository<City,Long> {
}
