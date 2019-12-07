package com.kk.microservices.currencycoversionservice.client;

import com.kk.microservices.currencycoversionservice.controller.model.CurrentConversionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrecnyExchangeServiceClient {

//    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    @GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    public CurrentConversionBean getCurrencyExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
