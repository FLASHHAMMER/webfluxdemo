package com.example.demo.model.holiday;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Holiday{
    @Id
    private String id;
    @JsonProperty("date")
    private String date;
    @JsonProperty("localName")
    private String localName;
    @JsonProperty("types")
    private List<String> types;
    @JsonProperty("launchYear")
    private Integer launchYear;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("name")
    private String name;
    @JsonProperty("fixed")
    private Boolean fixed;
    @JsonProperty("global")
    private Boolean global;
    @JsonProperty("counties")
    private List<String> counties;

    public Holiday() {
        super();
    }

    public Holiday(String id, String date, String localName, List<String> types, Integer launchYear, String countryCode, String name, Boolean fixed, Boolean global, List<String> counties) {
        this.id = id;
        this.date = date;
        this.localName = localName;
        this.types = types;
        this.launchYear = launchYear;
        this.countryCode = countryCode;
        this.name = name;
        this.fixed = fixed;
        this.global = global;
        this.counties = counties;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public Integer getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(Integer launchYear) {
        this.launchYear = launchYear;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getFixed() {
        return fixed;
    }

    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    public Boolean getGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    public List<String> getCounties() {
        return counties;
    }

    public void setCounties(List<String> counties) {
        this.counties = counties;
    }
}