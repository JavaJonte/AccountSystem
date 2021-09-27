package com.jonte.testing.springjpatests.interfaces;

import com.jonte.testing.springjpatests.entitys.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

// här så länkar vi bara till JpaRepository för att nå dess många metoder

@Repository // berättar att det är en repository böna
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // här inne skriver vi Querys till databasen och injektar JpaRepository


    // den här koden kollar i databasen om någon har samma email som den som försöker skapa ett nytt konto
    // SELECT * FROM customer WHERE email = ?     // så här ser Queryn ut för våran databas
    //@Query("SELECT s FROM Customer s WHERE s.email = ?1")   // så här kan man göra
    Optional<Customer> findCustomerByEmail(String email);         // eller såhär
}
