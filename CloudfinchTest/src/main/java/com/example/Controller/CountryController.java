package com.example.Controller;

import com.example.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CountryController {

    CountryService countryService;

    @Autowired
    public CountryController(CountryService countryService){

    }

    @GetMapping("/country")
    public ResponseEntity<?> getAllLargestCountry(){
        return new ResponseEntity<>(countryService.getAllLargestCountry(), HttpStatus.OK);
    }
}
