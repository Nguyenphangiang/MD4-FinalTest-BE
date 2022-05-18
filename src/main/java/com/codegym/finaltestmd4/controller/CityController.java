package com.codegym.finaltestmd4.controller;

import com.codegym.finaltestmd4.model.City;
import com.codegym.finaltestmd4.model.Country;
import com.codegym.finaltestmd4.repo.ICountryRepository;
import com.codegym.finaltestmd4.service.city.ICityService;
import com.codegym.finaltestmd4.service.country.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/city")
@CrossOrigin("*")
public class CityController {
    @Autowired
    ICityService cityService;

    @Autowired
    ICountryService countryService;

    @GetMapping("")
    private ResponseEntity<Iterable<City>> showAll(){
        return new ResponseEntity<>(cityService.findAll(), HttpStatus.OK);
    }
    @PostMapping("")
    private ResponseEntity<City> createCity(@RequestBody City city){
        return new ResponseEntity<>(cityService.save(city),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    private ResponseEntity<City> editCityInformation(@PathVariable Long id,@RequestBody City city){
        Optional<City> optionalCity = cityService.findById(id);
        city.setId(optionalCity.get().getId());
        return new ResponseEntity<>(cityService.save(city),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/{id}")
    private ResponseEntity<City> deleteCity(@PathVariable Long id){
        cityService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/country")
    private ResponseEntity<Iterable<Country>> showAllCountry(){
        return new ResponseEntity<>(countryService.findAll(),HttpStatus.OK);
    }
    @GetMapping("/{id}")
    private ResponseEntity<City> findOneById(@PathVariable Long id){
        Optional<City> optionalCity = cityService.findById(id);
        City city = optionalCity.get();
        return new ResponseEntity<>(city,HttpStatus.OK);
    }
}
