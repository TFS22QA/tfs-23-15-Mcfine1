package person;

import person.models.Passport;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;

public class Person {

    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    private Passport passport;

    public Person(String id, String lastName, String firstName, String middleName,
                  Physical phys, Appearance appearance, Phone phone, Passport passport) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
        this.passport = passport;
    }

    @Override
    public final String toString() {
        return id + "\n" + lastName + "\n" + firstName + "\n" +
                middleName + "\n" + phys + "\n" + appearance + "\n" + phone + "\n" + passport;
    }
}
