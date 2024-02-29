package com.example.demo.service;

import com.example.demo.model.holiday.Holiday;
import reactor.core.publisher.Flux;

public interface IHolidayService {
    Flux<Holiday> retrieveHolidaysByYearAndCountryCode(Integer year, String countryCode);

    Flux<Holiday> retrieveHolidaysByCountryCodeFromDB(String countryCode);
}
