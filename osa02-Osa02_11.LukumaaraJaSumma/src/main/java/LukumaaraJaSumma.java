
import java.util.Scanner;

public class LukumaaraJaSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int sum = 0;
        int nums = 0;
        while(true){
            System.out.println("Syötä luku");
            int num = Integer.valueOf(lukija.nextLine());

            if (num != 0) {
                sum += num;
                nums++;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Lukuja yhteensä " +nums);
        System.out.println("Lukujen summa "+sum);
    }
}
