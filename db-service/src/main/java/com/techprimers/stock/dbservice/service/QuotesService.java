package com.techprimers.stock.dbservice.service;

import com.techprimers.stock.dbservice.model.Quote;

import java.util.ArrayList;
import java.util.List;

public class QuotesService {

    private List<Quote> data = new ArrayList<>();

    public List<Quote> getQuotes(){
        this.data.add(new Quote());
        this.data.add(new Quote());
        this.data.add(new Quote());
        return data;
    }
}
