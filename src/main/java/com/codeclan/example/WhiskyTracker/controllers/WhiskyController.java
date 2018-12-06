package com.codeclan.example.WhiskyTracker.controllers;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/whiskies")
public class WhiskyController {

    @Autowired
    WhiskyRepository whiskyRepository;

    @GetMapping(value = "/all")
    public List<Whisky> getAllWhiskies(){
        return whiskyRepository.findAll();
    }

    @GetMapping(value = "/the_year/{year}")
    public List<Whisky> findAllWhiskiesByYEar(@PathVariable int year){
        return whiskyRepository.findAllWhiskiesByYEar(year);
    }

    @GetMapping(value = "/regions/{region}")
    public List<Whisky> findAllWhiskiesByRegion(@PathVariable String region){
        return whiskyRepository.findAllWhiskiesByRegion(region);
    }


}
