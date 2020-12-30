
import java.util.Scanner;

public class MuuttujienLukeminenYhdessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Syötä merkkijono!");
        String txt = lukija.nextLine();
        System.out.println("Syötä kokonaisluku!");
        int num = Integer.valueOf(lukija.nextLine());
        System.out.println("Syötä liukuluku!");
        double flt = Double.valueOf(lukija.nextLine());
        System.out.println("Syötä totuusarvo!");
        boolean val = Boolean.valueOf(lukija.nextLine());

        System.out.println("Syötit merkkijonon "+txt+"\nSyötit kokonaisluvun "+num+"\nSyötit liukuluvun "+flt+"\nSyötit totuusarvon "+val);
    }
}
