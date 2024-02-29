package com.example.demo.controller;

import com.example.demo.model.holiday.Holiday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Flux;

@RequestMapping(path = "${api.holiday.endpoint}")
public interface IHolidayController {
    @GetMapping("/{year}/{countryCode}")
    Flux<Holiday> retrieveHolidaysByYearAndCountryCode(
            @PathVariable Integer year,
            @PathVariable String countryCode
    );
    @GetMapping("/db/{countryCode}")
    Flux<Holiday> retrieveHolidaysByCountryCodeFromDB(
            @PathVariable String countryCode
    );
}
