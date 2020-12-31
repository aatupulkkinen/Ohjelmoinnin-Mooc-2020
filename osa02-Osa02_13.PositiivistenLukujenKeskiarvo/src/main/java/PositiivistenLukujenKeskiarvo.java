
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int posNums = 0;
        int sum = 0;

        while (true) {
            int num = Integer.valueOf(lukija.nextLine());
            if (num != 0) {
                if (num > 0) {
                    posNums++;
                    sum += num;
                }
                continue;
            } else {
                break;
            }
        }
        if (posNums != 0) {
            System.out.println((sum * 1.0) / posNums);
        } else {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        }
    }
}