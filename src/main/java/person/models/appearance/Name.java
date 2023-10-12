package person.models.appearance;

public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }
    public String toString() {
        return lastName + " " + firstName +" " + middleName;
    }
}
