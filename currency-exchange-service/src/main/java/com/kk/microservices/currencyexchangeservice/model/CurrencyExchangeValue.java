package com.kk.microservices.currencyexchangeservice.model;

import java.math.BigDecimal;

public class CurrencyExchangeValue {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public CurrencyExchangeValue() {
    }

    public CurrencyExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }
}
