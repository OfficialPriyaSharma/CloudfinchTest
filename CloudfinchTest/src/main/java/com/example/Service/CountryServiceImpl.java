package com.example.Service;

import com.example.Entity.Country;
import com.example.Repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
    }


    @Override
    public List<Country> getAllLargestCountry() {
        return countryRepository.findAll();

    }
}
