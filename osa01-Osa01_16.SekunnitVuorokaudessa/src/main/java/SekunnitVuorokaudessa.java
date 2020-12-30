
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        int scndsYear = 86400;

        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");

        int num = Integer.valueOf(lukija.nextLine());
        System.out.println(scndsYear * num);
    }
}
