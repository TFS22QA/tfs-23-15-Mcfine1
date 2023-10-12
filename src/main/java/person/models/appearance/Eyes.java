package person.models.appearance;

public class Eyes {
    private final String color;

    public Eyes(String color) {
        this.color = color;
    }

    @Override
    public final String toString() {
        return color;
    }
}
