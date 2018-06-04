package com.techprimers.stock.stockservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/stock")
public class StockResource {

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/test")
    public String test(){
        System.out.println("calling...");
        String data = restTemplate.getForObject("http://localhost:8300/rest/test", String.class);
        System.out.println("found - "+data);
        return data;
    }
}
