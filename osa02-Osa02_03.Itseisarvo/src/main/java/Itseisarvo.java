
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        int num = Integer.valueOf(lukija.nextLine());

        if (num < 0) {
            num = num * -1;
        }
        System.out.println(num);
    }
}
