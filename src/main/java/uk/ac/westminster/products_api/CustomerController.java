package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/customers/1")
    public Customer getCustomer() {
        Address address = new Address(
                "221B Baker Street",
                "London",
                "NW1 6XE"
        );

        return new Customer(
                1L,
                "Sherlock Holmes",
                "sherlock@example.com",
                address
        );
    }
}
