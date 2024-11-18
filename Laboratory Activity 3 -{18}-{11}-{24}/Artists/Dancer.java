package Artists;

public class Dancer extends Artist
{
    public enum DanceStyle { BALLET, HIPHOP, JAZZ, CONTEMPORARY }

    private DanceStyle dancestyle;

    public Dancer(String name, int age, String specialty, DanceStyle dancestyle) {
        super(name, age, "Artists.Dancer");
        this.dancestyle = dancestyle;
    }

    public String toString() {
        return super.toString() + "\nDanceStyle: " + dancestyle;
    }
}
