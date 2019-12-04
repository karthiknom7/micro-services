package com.kk.microservices.currencyexchangeservice.controller;

import com.kk.microservices.currencyexchangeservice.model.ExchangeValue;
import com.kk.microservices.currencyexchangeservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    ExchangeValueRepository exchangeValueRepository;
    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getCurrencyExchangeValue(@PathVariable String from, @PathVariable String to){
        return exchangeValueRepository.findByFromAndTo(from, to);
    }
}
