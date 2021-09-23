package com.jonte.testing.springjpatests;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "Customer")
@Table(name = "customer")

public class Customer {
    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false)
    private Integer id;
    private String firstName, lastName, email;


    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}
