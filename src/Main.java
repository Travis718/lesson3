import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();
        System.out.println("Поробуйте угадать число от 1 до 10");
        int a = rand.nextInt(10);


        for (int i = 1; i <= 3; i++) {
            int b = scan.nextInt();
            if (a == b) {
                System.out.println("Вы угадали");
                break;
                            }
            else System.out.println("Попробуйте еще раз");

            if (i == 3) System.out.println(" Попробуете еще? 0 - ДА, 1 - НЕТ");{
            int replay = scan.nextInt();
            switch (replay){

                case(1):
                    System.out.println("Жаль, в другой раз");
                    break;
                case (0): return;}


            }
            }

    }
}