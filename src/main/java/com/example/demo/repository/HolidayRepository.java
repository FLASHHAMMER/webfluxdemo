package com.example.demo.repository;

import com.example.demo.model.holiday.Holiday;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface HolidayRepository extends ReactiveMongoRepository<Holiday, String> {
    Flux<Holiday> findAllByCountryCode(String countryCode);
}
