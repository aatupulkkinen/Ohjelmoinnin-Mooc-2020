
import java.util.Scanner;

public class AlkioidenArvojenVaihtaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int[] taulukko = new int[5];
        taulukko[0] = 1;
        taulukko[1] = 3;
        taulukko[2] = 5;
        taulukko[3] = 7;
        taulukko[4] = 9;

        int indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
        System.out.println("Mitkä arvot vaihdetaan?");
        int index1 = Integer.valueOf(lukija.nextLine());
        int index2 = Integer.valueOf(lukija.nextLine());

        int storage = taulukko[index1];
        taulukko[index1] = taulukko[index2];
        taulukko[index2] = storage;
        // Toteuta indeksien kysyminen ja vaihto tänne

        System.out.println("");
        indeksi = 0;
        while (indeksi < taulukko.length) {
            System.out.println(taulukko[indeksi]);
            indeksi++;
        }
    }

}
