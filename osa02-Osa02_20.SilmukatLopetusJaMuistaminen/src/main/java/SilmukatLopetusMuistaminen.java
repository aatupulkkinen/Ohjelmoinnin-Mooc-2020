
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);

        int sum = 0;
        int nums = 0;
        int even = 0;
        int odd = 0;
        while (true){
            System.out.println("Syötä luvut: ");
            int num = Integer.valueOf(lukija.nextLine());

            if (num == -1){
                break;
            } else {
                sum += num;
                nums++;
                if (num % 2 == 0){
                    even++;
                } else if (num % 2 != 0){
                    odd++;
                }
                continue;
            }

        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: "+sum);
        System.out.println("Lukuja: "+nums);
        System.out.println("Keskiarvo: "+((sum*1.0)/nums));
        System.out.println("Parillisia: "+even);
        System.out.println("Parittomia: "+odd);
    }
}
