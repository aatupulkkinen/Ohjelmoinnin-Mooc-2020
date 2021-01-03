
import java.util.Scanner;

public class MontaTulostusta {

    public static void main(String[] args) {
        // kysy käyttäjältä, montako kertaa teksti tulostetaan
        // kutsu metodia tulostaTeksti while-komennon avulla useita kertoja
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kuinka monta?");
        int amount = Integer.valueOf(lukija.nextLine());

        for (int i=0; i < amount; i++){
            tulostaTeksti();
        }
    }

    public static void tulostaTeksti() {
        System.out.println("Alussa olivat suo, kuokka ja Java.");
    }
}
