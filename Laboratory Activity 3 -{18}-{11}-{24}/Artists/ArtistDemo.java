package Artists;

public class ArtistDemo
{
    public static void main (String[] args)
    {
        Artist Charlie_Puth = new Artist("Charlie Puth", 32, "Music");
        System.out.println(Charlie_Puth);

        System.out.println("\nSinger's info:");
        Singer Nayeon_Im = new Singer("Nayeon Im", 29, "Artists.Singer", Singer.Genre.POP);
        System.out.println(Nayeon_Im);

        System.out.println("\nWriter's info:");
        Writer Haruki_Murakami = new Writer("Haruki Murakami", 71, "Artists.Writer", Writer.WritingStyle.FICTION);
        System.out.println(Haruki_Murakami);

        System.out.println("\nSinger's info:");
        Singer Tatsuya_Kitani = new Singer("Tatsuya Kitani", 28, "Artists.Singer", Singer.Genre.POP);
        System.out.println(Tatsuya_Kitani);
    }
}
