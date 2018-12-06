package com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository;

import com.codeclan.example.WhiskyTracker.models.Whisky;

import java.util.List;

public interface WhiskyRepositoryCustom {

    public List<Whisky> findAllWhiskiesByYEar(int year);

    public List<Whisky> findAllWhiskiesByRegion(String region);
}
