
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
            String strng = lukija.nextLine();
            if (strng.equals("")) {
                break;
            } else {
                String[] line = strng.split(" ");
                System.out.println(line[0]);
            }
        }
    }
}
