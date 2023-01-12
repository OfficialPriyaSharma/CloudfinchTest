package com.example.Repository;

import com.example.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("select countryName, capital, region from country WHERE capital IN (SELECT countryName, capital, MAX(area) FROM country GROUP BY countryName")
    public List<Country> getAllLargestCountry();
}
