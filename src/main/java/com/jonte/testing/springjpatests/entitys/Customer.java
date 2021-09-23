package com.jonte.testing.springjpatests.entitys;

import lombok.*;
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
    private Long id;
    private String firstName;

}
