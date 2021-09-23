package com.jonte.testing.springjpatests.interfaces;

import com.jonte.testing.springjpatests.entitys.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
