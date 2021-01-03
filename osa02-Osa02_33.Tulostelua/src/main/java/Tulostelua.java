
public class Tulostelua {

    public static void main(String[] args) {

        tulostaTahtia(3);
        System.out.println("\n---"); // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 2);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        for (int i = 1; i <= maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        for (int i = 1; i <= sivunpituus; i++) {
            tulostaTahtia(sivunpituus);
        }
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        for (int i = 1; i <= korkeus; i++) {
            tulostaTahtia(leveys);
        }
        System.out.println(" ");
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
        for (int i = 1; i <= koko; i++) {
            tulostaTahtia(i);
        }
    }
}
