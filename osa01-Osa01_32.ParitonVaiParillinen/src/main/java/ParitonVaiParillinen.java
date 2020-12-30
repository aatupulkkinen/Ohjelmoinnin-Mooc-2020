
import java.util.Scanner;

public class ParitonVaiParillinen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.println("Anna luku:");

        int num = Integer.valueOf(lukija.nextLine());
        if (num%2 == 0){
            System.out.println("Luku "+num+" on parillinen.");
        } else {
            System.out.println("Luku "+num+" on pariton.");
        }
    }
}
