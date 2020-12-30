
import java.util.Scanner;

public class KolmenLuvunSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int num1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int num2 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä kolmas luku!");
        int num3 = Integer.valueOf(lukija.nextLine());
        System.out.println("Lukujen summa on "+(num1 + num2 + num3));
    }
}
