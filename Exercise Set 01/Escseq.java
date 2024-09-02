import java.util.Scanner;
public class Escseq {
    int num_of_itr;

    public void GetMultiples()
    {
        System.out.println("input the number of multiples: ");
        Scanner scanner = new Scanner(System.in);
        num_of_itr = scanner.nextInt();
        //sorry nagana na eh, diko na muna papakaelaman HAHAHAH at gutom nako
    }

    public void PrintSequence() {
        for (int i = 1; i < num_of_itr + 1; i++) {
            if ((i % 2) == 0) {
                System.out.println("\t" + (i * 7));
            } else {
                System.out.println((i * 7));
            }
        }
    }
}

//GAGAWIN KO MAMAYA YUNG REVERSE BRACKETS FORMAT