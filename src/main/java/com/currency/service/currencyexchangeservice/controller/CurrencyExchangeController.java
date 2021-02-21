package com.currency.service.currencyexchangeservice.controller;

import com.currency.service.currencyexchangeservice.model.CurrencyExchange;
import com.currency.service.currencyexchangeservice.repository.CurrencyExchangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeRepository currencyExchangeRepository;

    @GetMapping("currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchange(
            @PathVariable String from,
            @PathVariable String to
    ) {
        final CurrencyExchange currencyExchange =
                currencyExchangeRepository.getOne(1001L);
        if (currencyExchange == null) {
            throw new RuntimeException("Unable to find data");
        }
        final String port = environment.getProperty("local.server.port");
        currencyExchange.setEnvironment(port);
        return currencyExchange;
    }

}
