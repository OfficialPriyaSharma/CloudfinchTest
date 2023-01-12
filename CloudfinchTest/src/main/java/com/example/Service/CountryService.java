package com.example.Service;

import com.example.Entity.Country;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryService {

    public List<Country> getAllLargestCountry();
}
