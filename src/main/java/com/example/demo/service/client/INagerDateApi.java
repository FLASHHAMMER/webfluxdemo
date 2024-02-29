package com.example.demo.service.client;

import com.example.demo.model.holiday.Holiday;
import reactor.core.publisher.Flux;

public interface INagerDateApi {
    Flux<Holiday> retrieveHolidaysByYearAndCountryCode(Integer year, String countryCode);
}
