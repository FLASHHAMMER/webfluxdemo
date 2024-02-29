package com.example.demo.service.client.impl;

import com.example.demo.model.holiday.Holiday;
import com.example.demo.service.client.INagerDateApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class NagerDateApiImpl implements INagerDateApi {
    private static final Logger logger = LoggerFactory.getLogger(NagerDateApiImpl.class);
    private final WebClient webClient = WebClient.create();
    private static final String NAGER_URL = "https://date.nager.at";
    @Override
    public Flux<Holiday> retrieveHolidaysByYearAndCountryCode(Integer year, String countryCode) {
    String url = NAGER_URL + "/api/v3/PublicHolidays/" + year + "/" + countryCode;
        return webClient
                .get()
                .uri(url)
                .retrieve()
                .bodyToFlux(Holiday.class)
                .share()
                .doOnSubscribe(subscription -> logger.info("Subscribed to {}", url))
                ;
    }
}
