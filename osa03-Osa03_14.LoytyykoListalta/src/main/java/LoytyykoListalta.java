
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        System.out.println("Ketä etsitään?");
        String input = lukija.nextLine();

        if (lista.contains(input)){
            System.out.println(input+" löytyi!");
        } else {
            System.out.println(input+" ei löytynyt!");
        }
    }
}
