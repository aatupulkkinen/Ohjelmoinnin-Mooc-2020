
import java.util.Scanner;

public class ParametristaYhteen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        tulostaLuvustaYhteen(10);
    }

    public static void tulostaLuvustaYhteen(int num){
        for (int i=1; num >= i; num--){
            System.out.println(num);
        }
    }
}
