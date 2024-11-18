import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int number_of_elements = input.nextInt();

        int[] array = new int[number_of_elements];
        double mean_of_array = 0;
        for (int i = 0; i < number_of_elements; i++) {
            System.out.print("Enter value for Element [" + (i + 1) + "]: ");
            array[i] = input.nextInt();
            mean_of_array += array[i];
        }
        System.out.println("\nThe mean of the array is: " + mean_of_array / number_of_elements);

    }
}
