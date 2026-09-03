package com.example.repository;

import com.example.model.Expeditions;

import java.util.List;

public class ExpeditionsRepository {

    public ExpeditionsRepository(List<Expeditions> expeditions) {
        this.expeditions = expeditions;
    }

    private List<Expeditions> expeditions;

}
