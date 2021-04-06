package com.volmyr.java_tour.warehouse_api_ms.rest_api.controllers;

import domain.Product;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link ApiRestControllerV1}
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ApiRestControllerV1Test {
    private final ApiRestControllerV1 apiRestControllerV1 = new ApiRestControllerV1();
    int numberOfGoodsBefore = apiRestControllerV1.numberOfGoods();

    @Test
    @Order(1)
    void shouldReturnZeroNumberOfGoodsInWarehouse() {
        assertThat(apiRestControllerV1.numberOfGoods()).isEqualTo(0);
    }

    @Test
    @Order(2)
    void shouldAddOneGoodToWarehouse() {
        Product product = new Product();
        product.setId(5);
        apiRestControllerV1.addOneNewGood(product);

        assertThat(apiRestControllerV1.numberOfGoods()).isEqualTo(numberOfGoodsBefore + 1);
    }

    @Test
    @Order(3)
    void shouldDeleteOneGoodFromWarehouse() {
        Product product = new Product();
        product.setId(5);
        apiRestControllerV1.deleteOneGoodFromWarehouse(product);

        assertThat(apiRestControllerV1.numberOfGoods()).isEqualTo(numberOfGoodsBefore - 1);
    }

    @Test
    @Order(4)
    void shouldAddTwoGoodsToWarehouse() {
        Product product = new Product();
        product.setId(2);
        apiRestControllerV1.addOneNewGood(product);

        product = new Product();
        product.setId(4);
        apiRestControllerV1.addOneNewGood(product);

        assertThat(apiRestControllerV1.numberOfGoods()).isEqualTo(numberOfGoodsBefore + 2);
    }


    @ParameterizedTest
    @ValueSource(longs = {2, 4})
    @Order(5)
    void shouldReturnExistingProductsById(long id) {
        Product product = apiRestControllerV1.getProduct(id);

        assertThat(product.getId()).isEqualTo(id);


    }


}