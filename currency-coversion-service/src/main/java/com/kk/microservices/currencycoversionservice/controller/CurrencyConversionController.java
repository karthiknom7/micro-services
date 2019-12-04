package com.kk.microservices.currencycoversionservice.controller;

import com.kk.microservices.currencycoversionservice.client.CurrecnyExchangeServiceClient;
import com.kk.microservices.currencycoversionservice.controller.model.CurrentConversionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @Autowired
    private CurrecnyExchangeServiceClient currecnyExchangeServiceClient;

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrentConversionBean getCurrentConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
        CurrentConversionBean currencyExchangeValue = currecnyExchangeServiceClient.getCurrencyExchangeValue(from, to);
        return new CurrentConversionBean(100L, from, to,
                currencyExchangeValue.getConversionMultiple(),
                quantity, quantity.multiply(currencyExchangeValue.getConversionMultiple()) );
    }
}
