package person;

import person.models.Passport;
import person.models.Phone;
import person.models.Physical;
import person.models.appearance.Appearance;
import person.models.appearance.Name;

public class Person {

    private String id;
    private Name name;
    private Physical phys;
    private Appearance appearance;
    private Phone phone;

    private Passport passport;

    public Person(String id, Name name, Physical phys, Appearance appearance, Phone phone, Passport passport) {
        this.id = id;
        this.name = name;
        this.phys = phys;
        this.appearance = appearance;
        this.phone = phone;
        this.passport = passport;
    }

    @Override
    public final String toString() {
        return id + "\n" + name + "\n" + phys + "\n" + appearance + "\n" + phone + "\n" + passport;
    }
}
