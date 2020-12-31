
import java.util.Scanner;

public class TietoaLuvuista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int num = Integer.valueOf(lukija.nextLine());
        int num2 = Integer.valueOf(lukija.nextLine());

        if (num > num2) {
            System.out.println("Luku " + num + " on suurempi kuin luku " + num2 + ".");
        } else if (num2 > num) {
            System.out.println("Luku " + num + " on pienempi kuin luku " + num2 + ".");
        } else if (num == num2) {
            System.out.println("Luku " + num + " on yhtä suuri kuin luku " + num2 + ".");
        }
    }
}
