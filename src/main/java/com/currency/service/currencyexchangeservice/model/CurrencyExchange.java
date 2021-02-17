package com.currency.service.currencyexchangeservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class CurrencyExchange {

    @Id
    private long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    private BigDecimal ConversionMultiple;
    private String environment;

    public CurrencyExchange() {

    }

    public CurrencyExchange(long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.ConversionMultiple = conversionMultiple;
    }

    public BigDecimal getConversionMultiple() {
        return ConversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        ConversionMultiple = conversionMultiple;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
