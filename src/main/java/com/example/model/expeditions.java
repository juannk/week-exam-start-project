package com.example.model;
import java.util.List;
import java.util.ArrayList;

public class expeditions {

    private Integer Id;
    private String Name;
    private String Region;
    private String BaseCamp;
    private String Leader;
    private String StartDate;
    private String EndDate;
    private String Estate;

    public expeditions(Integer id, String name, String baseCamp, String region, String leader, String startDate, String endDate, String estate) {
        Id = id;
        Name = name;
        BaseCamp = baseCamp;
        Region = region;
        Leader = leader;
        StartDate = startDate;
        EndDate = endDate;
        Estate = estate;
    }


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBaseCamp() {
        return BaseCamp;
    }

    public void setBaseCamp(String baseCamp) {
        BaseCamp = baseCamp;
    }

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getEstate() {
        return Estate;
    }

    public void setEstate(String estate) {
        Estate = estate;
    }


}
