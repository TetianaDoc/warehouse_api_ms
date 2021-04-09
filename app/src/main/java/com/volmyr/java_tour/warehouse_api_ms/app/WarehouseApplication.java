package com.volmyr.java_tour.warehouse_api_ms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;


/**
 * Warehouse Application Endpoint.
 */
@SpringBootApplication
@ComponentScan("com.volmyr.java_tour.warehouse_api_ms")
@EntityScan(basePackages = {"com.volmyr.java_tour.warehouse_api_ms.rest_api.domain"})
public class WarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
    }
}
