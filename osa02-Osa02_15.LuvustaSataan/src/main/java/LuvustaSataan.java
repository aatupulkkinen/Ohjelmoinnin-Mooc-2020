
import java.util.Scanner;

public class LuvustaSataan {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int num = Integer.valueOf(lukija.nextLine());

        while (num <= 100) {
            System.out.println(num);
            num++;
        }
    }
}
