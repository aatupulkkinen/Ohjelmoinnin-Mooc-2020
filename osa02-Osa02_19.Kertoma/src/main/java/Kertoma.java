
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna luku:");
        int num = Integer.valueOf(lukija.nextLine());
        int sum = 1;

        for (int i = 1; i <= num; i++){
            sum *= i;
        }
        System.out.println("Kertoma on "+sum);
    }
}
