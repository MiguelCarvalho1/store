package com.miguel.store.repositories;

import com.miguel.store.entities.Order;
import com.miguel.store.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
