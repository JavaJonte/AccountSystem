package com.jonte.testing.springjpatests.interfaces;

import com.jonte.testing.springjpatests.entitys.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // berättar att det är en repository böna
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
