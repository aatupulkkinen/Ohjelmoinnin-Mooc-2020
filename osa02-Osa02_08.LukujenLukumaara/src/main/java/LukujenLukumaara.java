
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int numAmount = 0;

        while(true) {
            System.out.println("Syötä luku");
            int num = Integer.valueOf(lukija.nextLine());
            if (num != 0) {
                numAmount++;
                continue;
            } else if (num == 0) {
                break;
            }
        }
        System.out.println("Lukuja yhteensä "+ numAmount);
    }
}
