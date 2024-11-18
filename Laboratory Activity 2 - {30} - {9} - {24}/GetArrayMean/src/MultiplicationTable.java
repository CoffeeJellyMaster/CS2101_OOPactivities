import java.util.Scanner;


public class MultiplicationTable
{
    public static void main(String[] args) {
        System.out.print("Enter the size of table: ");
        Scanner input = new Scanner(System.in);
        int size_of_table = input.nextInt();

        for(int i = 0; i < size_of_table; i++ )
        {
            for (int j = 0; j < size_of_table; j++)
            {
                System.out.printf("%4d",(i+1) * (j+1));
            }
            System.out.println();
        }

    }
}

//pag gumawa kana ng project mo, good error handling, JR yun lang like legit,
//di ka magkukulang sa logic, di ka rin magkukulang sa pagcocode mo,
//there are 10000000 ewan kopa ways to solve a problem, yeah alam kong hahanapin mo yung most efficient, most fastest and most desirable and readable pero
//make sure sa 10000+ ways na style na pwede mong gawin, isa dun eh mahahagip yung mga errors na kaakibat nun
//as there are a million ways to do something, it also has a million ways to throw an error

//KAYA
//DON'T SHOOT YOURSELF IN THE FOOT.
//mag aral kana ng design patterns, ready na tayo.