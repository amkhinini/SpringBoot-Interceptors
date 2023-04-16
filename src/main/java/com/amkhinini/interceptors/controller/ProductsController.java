package com.amkhinini.interceptors.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductsController {

    private final Logger logger = LoggerFactory.getLogger(ProductsController.class);

    @GetMapping("/all")
    public ResponseEntity<String> getProducts() {
        logger.info("inside product controller");
        return ResponseEntity.ok("getting all products");
    }
}
