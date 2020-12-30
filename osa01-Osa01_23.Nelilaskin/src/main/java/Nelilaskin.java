
import java.util.Scanner;

public class Nelilaskin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä ensimmäinen luku!");
        int num1 = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä toinen luku!");
        int num2 = Integer.valueOf(lukija.nextLine());

        double avg = (1.0*(num1+num2))/2;
        System.out.println(num1+" + "+num2+" = "+(num1+num2));
        System.out.println(num1+" - "+num2+" = "+(num1-num2));
        System.out.println(num1+" * "+num2+" = "+(num1*num2));
        System.out.println(num1+" / "+num2+" = "+((1.0*num1)/num2));
    }
}
