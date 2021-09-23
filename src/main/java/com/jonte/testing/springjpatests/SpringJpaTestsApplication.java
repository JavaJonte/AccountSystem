package com.jonte.testing.springjpatests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaTestsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaTestsApplication.class, args);

/*
        CustomerImpl hej = new CustomerImpl();

        System.out.println(
                "1. Create\n" +
                        "2. Delete\n" +
                        "3. Show 1\n" +
                        "4. Show all\n");

        int userInput = sc.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("First name: ");
                String fName = sc.nextLine();
                sc.nextLine();
                System.out.println("Last name: ");
                String lName = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.nextLine();
                hej.createCustomer(new Customer(fName, lName, email));

            case 2:
                hej.getAllCustomers();
                System.out.println("Enter ID for customer to delete");
                int id = sc.nextInt();


            case 3:
            case 4:
            case 5:
        }

    }

*/

    }



    // BYGG CONSOL FUNKTIONALITET FÖR CRUD


}
