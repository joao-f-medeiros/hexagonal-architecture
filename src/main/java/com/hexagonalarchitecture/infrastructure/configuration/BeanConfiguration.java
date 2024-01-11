package com.hexagonalarchitecture.infrastructure.configuration;

import com.hexagonalarchitecture.domain.repository.OrderRepository;
import com.hexagonalarchitecture.domain.service.DomainOrderService;
import com.hexagonalarchitecture.domain.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    OrderService orderService(OrderRepository orderRepository) {
        return new DomainOrderService(orderRepository);
    }
}
