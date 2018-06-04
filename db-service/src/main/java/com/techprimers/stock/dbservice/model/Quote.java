package com.techprimers.stock.dbservice.model;

public class Quote {

    private long id;
    private String userName;
    private String quote;

    public Quote() {
        this.id = 3323;
        this.userName = "user";
        this.quote = "sample quote";
    }

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
