
import java.util.Scanner;

public class Uudestaan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while(true){
            System.out.println("Syötä luku");
            int num = Integer.valueOf(lukija.nextLine());

            if(num == 4){
                break;
            }
        }
    }
}
