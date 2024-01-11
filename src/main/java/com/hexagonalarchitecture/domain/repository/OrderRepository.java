package com.hexagonalarchitecture.domain.repository;

import com.hexagonalarchitecture.domain.Order;

import java.util.Optional;
import java.util.UUID;

public interface OrderRepository {

    Optional<Order> fiindById(UUID id);
    void save(Order order);
}
