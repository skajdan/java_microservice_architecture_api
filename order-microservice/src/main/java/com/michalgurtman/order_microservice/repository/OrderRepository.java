package com.michalgurtman.order_microservice.repository;

import com.michalgurtman.order_microservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
