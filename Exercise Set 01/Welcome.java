import java.util.Scanner;
public class Welcome
{
String name;
//Jr, getter and setter lang to
    public void Greetings()
    {
        System.out.println("Welcome to CS 211: Object-oriented Programming " + name);
    }
    public void SetName()
    {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        //putek sa class kasi inimport yung scanner kaya new obj sya
        //sabay nag set ka ng value sa name from the value of that object gamit yung method na scanner tama?
        name = scanner.nextLine();

    }

}
