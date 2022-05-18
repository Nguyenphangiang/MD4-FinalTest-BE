package com.codegym.finaltestmd4.model;

import javax.persistence.*;

@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getAcreage() {
        return acreage;
    }

    public void setAcreage(int acreage) {
        this.acreage = acreage;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public City(String name, Country country, int acreage, int population, int gdp, String description) {
        this.name = name;
        this.country = country;
        this.acreage = acreage;
        this.population = population;
        this.gdp = gdp;
        this.description = description;
    }

    public City(Long id, String name, Country country, int acreage, int population, int gdp, String description) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.acreage = acreage;
        this.population = population;
        this.gdp = gdp;
        this.description = description;
    }

    public City() {
    }

    private int acreage;

    private int population;

    private int gdp;

    private String description;
}
