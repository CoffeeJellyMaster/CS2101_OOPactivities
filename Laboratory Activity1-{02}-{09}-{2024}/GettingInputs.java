import java.util.Scanner;

public class GettingInputs
{
    public static void main(String[]args)
    {
        //CREATE OBJECTS
        Scanner Year  = new Scanner(System.in);
        Scanner Genre  = new Scanner(System.in);
        Scanner Album =  new Scanner(System.in);
        Scanner Title =  new Scanner(System.in);
        Scanner Artist =  new Scanner(System.in);
        //Parang struct dapat class template sya kung iistore ko yung mga values but per instruction, auto print lang muna after input

        System.out.print("Enter the year: ");
        int year = Year.nextInt();
        System.out.print("Enter the genre: ");
        String genre = Genre.nextLine();
        System.out.print("Enter the album: ");
        String album = Album.nextLine();
        System.out.print("Enter the song title: ");
        String title = Title.nextLine();
        System.out.print("Enter the artist: ");
        String artist = Artist.nextLine();

        System.out.println("---------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------");
        System.out.println("Year: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);


    }

}
