package Artists;

public class Singer extends Artist
{
    public enum Genre {
        POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
    }

    private Genre genre;

    public Singer(String name, int age, String specialty, Genre genre) {
        super(name, age, "Artists.Singer");
        this.genre = genre;
    }

    public String toString() {
        return super.toString() + "\nGenre: " + genre;
    }

}

//
//🎤 Artists.Singer	Genre	POP, ROCK, CLASSICAL, JAZZ, HIPHOP, RNB
//🎨 Artists.Painter	Medium	OIL, WATERCOLOR, ACRYLIC, PENCIL, CHARCOAL
//✍🏻 Artists.Writer	WritingStyle	FICTION, NONFICTION, POETRY, DRAMA
//💃🏻 Artists.Dancer	DanceStyle	BALLET, HIPHOP, JAZZ, CONTEMPORARY