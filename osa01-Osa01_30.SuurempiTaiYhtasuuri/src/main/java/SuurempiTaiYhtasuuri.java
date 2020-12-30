
import java.util.Scanner;

public class SuurempiTaiYhtasuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna ensimmäinen luku:");
        int num1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Anna toinen luku:");
        int num2 = Integer.valueOf(lukija.nextLine());

        if (num1 > num2) {
            System.out.println("Suurempi luku: "+num1);
        } else if (num2 > num1) {
            System.out.println("Suurempi luku: "+num2);
        } else{
            System.out.println("Luvut ovat yhtä suuret!");
        }
    }
}