package com.jonte.testing.springjpatests.entitys;

import lombok.*;


import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Customer")
@Table(name = "customer")    // skapar customer table

// det är här vi sätter hur en customer ska se ut och visar hur den ska läggas in i databasen

public class Customer {
    @Id
    @SequenceGenerator(           // lägger in datan på rätt sätt i databasen
            name = "customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(   //lägger in datan på rätt sätt i databasen
            strategy = GenerationType.SEQUENCE,
            generator = "customer_sequence"
    )
    @Column(name = "id", updatable = false)
    private Long id;
    private String firstName;
    private String email;

    // Construktor utan id
    public Customer(String firstName,String email) {
        this.firstName = firstName;
        this.email= email;
    }
}