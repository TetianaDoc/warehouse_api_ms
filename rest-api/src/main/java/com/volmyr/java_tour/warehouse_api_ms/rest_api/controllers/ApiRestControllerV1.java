package com.volmyr.java_tour.warehouse_api_ms.rest_api.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Warehouse API rest controller.
 */
@RestController
@RequestMapping(ApiRestControllerV1.BASE_URL)
public final class ApiRestControllerV1 {

    private static final Logger logger = LoggerFactory.getLogger(ApiRestControllerV1.class);

    public static final String BASE_URL = "/v1/warehouse/api";

    static final String VERSION = "1.0.0";

    @GetMapping("/version")
    public ResponseEntity<String> version() {
        logger.info("Got version request");
        return ResponseEntity.ok(VERSION);
    }
}
