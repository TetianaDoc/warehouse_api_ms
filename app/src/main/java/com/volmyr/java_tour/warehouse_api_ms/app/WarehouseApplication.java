package com.volmyr.java_tour.warehouse_api_ms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Warehouse Application Endpoint.
 */
@SpringBootApplication
@ComponentScan("com.volmyr.java_tour.warehouse_api_ms")
public class WarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(WarehouseApplication.class, args);
    }
}
