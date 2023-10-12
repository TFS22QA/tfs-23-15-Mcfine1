package person.models;

public class Passport {

    private final String number;

    public Passport(final String number) {
        this.number = number;
    }

    @Override
    public final String toString() {
        return "Passport:\t" + number;
    }
}
