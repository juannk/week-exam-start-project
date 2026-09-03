package com.example.repository;

import com.example.model.Expeditions;

import java.util.ArrayList;
import java.util.List;

public class ExpeditionsRepository {

    private List<Expeditions> expeditions;

    public ExpeditionsRepository() {
        this.expeditions = new ArrayList<>();
    }
    public List<Expeditions> getExpeditions() {
        return expeditions;
    }

    public void addExpedition(Expeditions expedition) {
        expeditions.add(expedition);
    }

}
