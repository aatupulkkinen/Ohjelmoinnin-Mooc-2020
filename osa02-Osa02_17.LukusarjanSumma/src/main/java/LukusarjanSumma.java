
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Mihin asti?");
        int num = Integer.valueOf(lukija.nextLine());
        int sum = 0;
        for(int i=0; i <= num; i++){
            sum += i;
        }
        System.out.println("Summa on "+sum);
    }
}