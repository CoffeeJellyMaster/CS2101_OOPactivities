package Artists;

public class Writer extends Artist
{
    public enum WritingStyle { FICTION, NONFICTION, POETRY, DRAMA }

    private WritingStyle writingStyle;

    public Writer(String name, int age, String specialty, WritingStyle writingStyle) {
        super(name, age, "Artists.Writer");
        this.writingStyle = writingStyle;
    }

    public String toString() {
        return super.toString() + "\nWritingStyle: " + writingStyle;
    }
}
