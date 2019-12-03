package com.kk.microservices.limitsservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

    private Integer maximum;
    private Integer minimum;

    public Integer getMaximum() {
        return maximum;
    }

    public Integer getMinimum() {
        return minimum;
    }

    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }
}
