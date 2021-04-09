package com.volmyr.java_tour.warehouse_api_ms.rest_api.repository;

import com.volmyr.java_tour.warehouse_api_ms.rest_api.domain.Product;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Repository for warehouse.
 */
@Component
public class WarehouseRepository {
    private static final Map<Long, Product> warehouse = new HashMap<>();

    public int count() {
        return warehouse.size();
    }

    public void save(Product product) {
        warehouse.put(product.getId(), product);
    }

    public void delete(long id) {
        warehouse.remove(id);
    }

    public Product getById(long productId) {
        return warehouse.get(productId);
    }
}
