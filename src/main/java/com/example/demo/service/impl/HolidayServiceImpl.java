package com.example.demo.service.impl;

import com.example.demo.model.holiday.Holiday;
import com.example.demo.repository.HolidayRepository;
import com.example.demo.service.IHolidayService;
import com.example.demo.service.client.INagerDateApi;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class HolidayServiceImpl implements IHolidayService {
    private final INagerDateApi nagerDateApi;
    private final HolidayRepository holidayRepository;

    public HolidayServiceImpl(INagerDateApi nagerDateApi, HolidayRepository holidayRepository) {
        this.nagerDateApi = nagerDateApi;
        this.holidayRepository = holidayRepository;
    }

    @Override
    public Flux<Holiday> retrieveHolidaysByYearAndCountryCode(Integer year, String countryCode) {
        return nagerDateApi.retrieveHolidaysByYearAndCountryCode(year, countryCode)
                .flatMap(
                        holidayRepository::save
                )
                .share()
                ;
    }

    @Override
    public Flux<Holiday> retrieveHolidaysByCountryCodeFromDB(String countryCode) {
        return holidayRepository.findAllByCountryCode(countryCode);
    }
}
