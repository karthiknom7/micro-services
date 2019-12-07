package com.kk.microservices.currencyexchangeservice.controller;

import com.kk.microservices.currencyexchangeservice.model.ExchangeValue;
import com.kk.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {
    private Logger log = LoggerFactory.getLogger(getClass());
    @Autowired
    ExchangeValueRepository exchangeValueRepository;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to){
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        log.info("{}", exchangeValue);
        return exchangeValue;
    }
}
