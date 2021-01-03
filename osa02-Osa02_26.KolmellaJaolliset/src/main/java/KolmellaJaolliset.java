
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kolmellaJaollisetValilta(2, 10);
    }

    public static void kolmellaJaollisetValilta(int start, int stop){
        while(start <= stop){
            if (start % 3 == 0){
                System.out.println(start);
            }
            start++;
        }
    }
}
