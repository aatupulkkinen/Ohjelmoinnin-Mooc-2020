
import java.util.Scanner;

public class ArvosanatJaPisteet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pisteet [0-100]:");
        int points = Integer.valueOf(lukija.nextLine());
        System.out.print("Arvosana: ");
        if (points > 100){
            System.out.print("uskomatonta!");
        } else if (points >= 90 && points <= 100){
            System.out.print(5);
        } else if (points >= 80 && points <= 89){
            System.out.print(4);
        } else if (points >= 70 && points <= 79){
            System.out.print(3);
        } else if (points >= 60 && points <= 69){
            System.out.print(2);
        } else if (points >= 50 && points <= 59){
            System.out.print(1);
        } else if (points >= 0 && points <= 49){
            System.out.print("hylätty");
        } else if (points < 0){
            System.out.print("mahdotonta"); 
        }
    }
}   
