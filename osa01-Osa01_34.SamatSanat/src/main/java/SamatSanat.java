
import java.util.Scanner;

public class SamatSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän.
        System.out.println("Syötä ensimmäinen merkkijono:");
        String txt1 = lukija.nextLine();
        System.out.println("Syötä toinen merkkijono:");
        String txt2 = lukija.nextLine();
        if (txt1.equals(txt2)){
            System.out.println("Samat sanat");
        } else {
            System.out.println("Ei sitten");
        }
    }
}
