
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Lahjan suuruus?");

        int price = Integer.valueOf(lukija.nextLine());
        double tax = 0.0;
        if (price < 5000){
            System.out.println("Ei veroa!");
        } else if (price >= 5000 && price < 25000) {
            tax = 100 + (price - 5000) * 0.08;
            System.out.println("Vero: "+tax);
        } else if (price >= 25000 && price < 55000){
            tax = 1700 + (price - 25000) * 0.10;
            System.out.println("Vero: "+tax);
        } else if (price >= 55000 && price < 200000){
            tax = 4700 + (price - 55000) * 0.12;
            System.out.println("Vero: "+tax);
        } else if (price >= 200000 && price < 1000000) {
            tax = 22100 + (price -200000) * 0.15;
            System.out.println("Vero: "+tax);
        } else if (price >= 1000000) {
            tax = 142100 + (price - 1000000) * 0.17;
            System.out.println("Vero: "+tax);
        }
    }
}
