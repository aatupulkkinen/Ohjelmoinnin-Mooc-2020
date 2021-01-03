
import java.util.Scanner;

public class YhdestaParametriin {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLukuunAsti(10);
    }

    public static void tulostaLukuunAsti (int num){
        for (int i = 1; i <= num; i++){
            System.out.println(i);
        }
    }
}
