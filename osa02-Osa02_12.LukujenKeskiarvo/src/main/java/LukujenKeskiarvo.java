
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int sum = 0;
        int nums = 0;

        while(true){
            System.out.println("Syötä luku");
            int num = Integer.valueOf(lukija.nextLine());

            if (num != 0){
                sum += num;
                nums++;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Lukujen keskiarvo "+(sum * 1.0 / nums));
    }
}
