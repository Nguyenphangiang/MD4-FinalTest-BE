package com.codegym.finaltestmd4.repo;

import com.codegym.finaltestmd4.model.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepository extends CrudRepository<Country,Long> {
}
