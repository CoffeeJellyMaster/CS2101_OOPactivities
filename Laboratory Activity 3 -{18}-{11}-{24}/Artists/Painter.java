package Artists;

public class Painter extends Artist {
    public enum Medium { OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL }

    private Medium medium;

    public Painter(String name, int age, String specialty, Medium medium) {
        super(name, age, "Artists.Painter");
        this.medium = medium;
    }

    public String toString() {
        return super.toString() + "\nMedium: " + medium;
    }
}
