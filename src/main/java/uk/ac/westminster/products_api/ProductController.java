package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products/1")
    public Product getProduct() {
        return new Product(1L, "Wireless Mouse", 24.99);
    }
}
