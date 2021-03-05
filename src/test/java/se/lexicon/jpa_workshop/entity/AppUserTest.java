package se.lexicon.jpa_workshop.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AppUserTest {

    @Test
    @DisplayName("Test1 : Create AppUser")
    public void Test1() {

        AppUser appUser = new AppUser();
        appUser.setFirstName("Asha");
        appUser.setLastName("Joseph");
        appUser.setEmail("ashajo@gmail.com");

    }
}