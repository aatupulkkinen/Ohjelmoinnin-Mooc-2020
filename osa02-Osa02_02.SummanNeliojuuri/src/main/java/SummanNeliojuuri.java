
import java.util.Scanner;

public class SummanNeliojuuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int num = Integer.valueOf(lukija.nextLine());
        num += Integer.valueOf(lukija.nextLine());
        double sqrt = Math.sqrt(num);
        System.out.println(sqrt); 
    }
}
