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
}