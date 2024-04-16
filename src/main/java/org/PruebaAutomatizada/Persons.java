package org.PruebaAutomatizada;
import java.time.LocalDate;

public class Persons {
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;

    public void Person(String firstName, String lastName, LocalDate dateBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}