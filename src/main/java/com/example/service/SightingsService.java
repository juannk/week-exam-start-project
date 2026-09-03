package com.example.service;

import com.example.model.Sightings;
import com.example.repository.SightingsRepository;

import java.util.List;

public class SightingsService {

    private SightingsService sightingsRepository;

    // =========================================================
    // INYECCIÓN POR CONSTRUCTOR
    // =========================================================
    public SightingsService(SightingsRepository sightingsRepository) {

        this.sightingsRepository = sightingsRepository;
    }

    // =========================================================
    // OBTENER TODOS LOS TRACKS
    // =========================================================
    public List<Sightings> getAllTracks() {

        return SightingsRepository.getSightings();
    }

}

