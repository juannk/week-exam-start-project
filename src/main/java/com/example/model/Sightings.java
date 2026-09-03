package com.example.model;

public class Sightings {

    private Integer Id;

    private String SightingCode;
    private String Name;
    private String Description;
    private String ScientificName;
    private String SightedAt;
    private String Location;
    private Integer Quantity;
    private Integer ConfidenceLevel;
    private Integer ExpeditionId;
    private Integer expeditionId;

    public Sightings(Integer id, Integer expeditionId, Integer confidenceLevel, Integer quantity, String location, String scientificName, String sightedAt, String name, String description, String sightingCode) {
        Id = id;
        ExpeditionId = expeditionId;
        ConfidenceLevel = confidenceLevel;
        Quantity = quantity;
        Location = location;
        ScientificName = scientificName;
        SightedAt = sightedAt;
        Name = name;
        Description = description;
        SightingCode = sightingCode;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getSightingCode() {
        return SightingCode;
    }

    public void setSightingCode(String sightingCode) {
        SightingCode = sightingCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getScientificName() {
        return ScientificName;
    }

    public void setScientificName(String scientificName) {
        ScientificName = scientificName;
    }

    public String getSightedAt() {
        return SightedAt;
    }

    public void setSightedAt(String sightedAt) {
        SightedAt = sightedAt;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Integer getExpeditionId() {
        return ExpeditionId;
    }

    public void setExpeditionId(Integer expeditionId) {
        ExpeditionId = expeditionId;
    }

    public Integer getConfidenceLevel() {
        return ConfidenceLevel;
    }

    public void setConfidenceLevel(Integer confidenceLevel) {
        ConfidenceLevel = confidenceLevel;
    }


}
