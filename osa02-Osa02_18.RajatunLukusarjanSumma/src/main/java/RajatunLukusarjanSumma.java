
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Ensimmäinen:");
        int num = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int target = Integer.valueOf(lukija.nextLine());
        int sum = 0;

        while (num <= target) {
            sum += num;
            num++;
        }
        System.out.println("Summa on "+sum);
    }
}
