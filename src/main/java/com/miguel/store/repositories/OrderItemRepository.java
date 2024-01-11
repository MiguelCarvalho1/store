package com.miguel.store.repositories;

import com.miguel.store.entities.OrderItem;
import com.miguel.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
