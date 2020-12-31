
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int target = Integer.valueOf(lukija.nextLine());
        System.out.println("Mistä lähtien?");
        int num = Integer.valueOf(lukija.nextLine());

        while(num <= target) {
            System.out.println(num);
            num++;
        }
    }
}
