
import java.util.Scanner;

public class Kayttajatunnukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Anna tunnus: ");
        String username = lukija.nextLine();
        System.out.println("Anna salasana: ");
        String password = lukija.nextLine();

        if (username.equals("aleksi") && password.equals("tappara")
                || username.equals("elina") && password.equals("kissa")) {
            System.out.println("Olet kirjautunut järjestelmään");
        } else {
            System.out.println("Virheellinen tunnus tai salasana!");
        }
    }
}
