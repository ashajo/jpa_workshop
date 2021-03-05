package se.lexicon.jpa_workshop.entity;



import javax.persistence.*;
import java.util.Objects;

@Entity
public class AppUser {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
   @Column(nullable = false,length = 255)
    private String firstName;
   @Column(nullable = false,length = 255)
    private String lastName;
   @Column(nullable = false,unique = true)
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return id == appUser.id && Objects.equals(firstName, appUser.firstName) && Objects.equals(lastName, appUser.lastName) && Objects.equals(email, appUser.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
