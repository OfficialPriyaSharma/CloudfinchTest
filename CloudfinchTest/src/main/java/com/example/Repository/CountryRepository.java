package com.example.Repository;

import com.example.Entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    @Query("select continent, name, area from world WHERE name IN (SELECT continent, name, MAX(area) FROM world GROUP BY continent")
    public List<Country> getAllLargestCountry();
}
