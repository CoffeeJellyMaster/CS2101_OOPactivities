import java.util.Scanner;

public class GettingGreater
{
public static void main(String[]args)
{
    Scanner first_char = new Scanner (System.in);
    Scanner second_char = new Scanner (System.in);

    System.out.println("Getting the Greater Value");
    System.out.print("Enter the first character: ");
    char first = first_char.next().charAt(0);
    System.out.print("Enter the second character: ");
    char second = second_char.next().charAt(0);

    System.out.println("f : " + (int)first);
    System.out.println("A : " + (int)second);


}

}
