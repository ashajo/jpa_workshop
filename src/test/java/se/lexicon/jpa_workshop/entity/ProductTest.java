package se.lexicon.jpa_workshop.entity;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductTest {

    @Test
    @DisplayName("Test1: Create Product")

    public void Test1() {
        Product createProduct = new Product();
        createProduct.setPrice(10000);
        createProduct.setName("Mobile Phone");
    }


}
