package com.techprimers.stock.dbservice.resource;

import com.techprimers.stock.dbservice.model.Quote;
import com.techprimers.stock.dbservice.service.QuotesService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("rest")
public class DbServiceResource {

    private QuotesService service;

    @GetMapping("/test")
    public String getQuotes() {
        return "db-service: alive!!!!";
    }

//    @PostMapping("/add")
//    public List<String> add (@RequestBody final Quote quotes) {
//
//        return null;
//    }
}
