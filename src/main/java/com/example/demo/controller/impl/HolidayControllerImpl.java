package com.example.demo.controller.impl;

import com.example.demo.controller.IHolidayController;
import com.example.demo.model.holiday.Holiday;
import com.example.demo.service.IHolidayService;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class HolidayControllerImpl implements IHolidayController {
    private final IHolidayService holidayService;

    public HolidayControllerImpl(IHolidayService holidayService) {
        this.holidayService = holidayService;
    }

    @Override
    public Flux<Holiday> retrieveHolidaysByYearAndCountryCode(Integer year, String countryCode) {
        return holidayService.retrieveHolidaysByYearAndCountryCode(year, countryCode);
    }

    @Override
    public Flux<Holiday> retrieveHolidaysByCountryCodeFromDB(String countryCode) {
        return holidayService.retrieveHolidaysByCountryCodeFromDB(countryCode);
    }
}
