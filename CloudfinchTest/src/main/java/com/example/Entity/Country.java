package com.example.Entity;

import javax.persistence.Entity;

@Entity
public class Country {

    private String countryName;
    private String countryCapital;
    private int relevance;
    private String region;
    private String subregion;
    private String translation;
    private long population;

    public Country(){

    }

    public Country(String countryName, String countryCapital, int relevance, String region, String subregion, String translation, long population) {
        this.countryName = countryName;
        this.countryCapital = countryCapital;
        this.relevance = relevance;
        this.region = region;
        this.subregion = subregion;
        this.translation = translation;
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }

    public int getRelevance() {
        return relevance;
    }

    public void setRelevance(int relevance) {
        this.relevance = relevance;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", countryCapital='" + countryCapital + '\'' +
                ", relevance=" + relevance +
                ", region='" + region + '\'' +
                ", subregion='" + subregion + '\'' +
                ", translation='" + translation + '\'' +
                ", population=" + population +
                '}';
    }
}
