package com.varchenko.ttshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class WebController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/products")
    public List<Object> getProductList() {
        String url = "http://localhost:8080/products";
        Object[] objects = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(objects);
    }
}