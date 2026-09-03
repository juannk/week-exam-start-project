package com.example.service;

import com.example.model.Expeditions;

import java.util.List;

public class ExpeditionService {


    private ExpeditionService expeditionService;

    public ExpeditionService(ExpeditionService expeditionService) {
        this.expeditionService = expeditionService;
    }

    public List<Expeditions> getAllExpeditions() {

        return expeditionService.getAllExpeditions();
    }




}
