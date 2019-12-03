package com.kk.microservices.limitsservice.model;


public class LimitConfiguration {

    private Integer maximum;
    private Integer minimum;

    public LimitConfiguration(Integer maximum, Integer minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }

    public LimitConfiguration() {
    }

    public Integer getMaximum() {
        return maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }
}
