
import java.util.ArrayList;
import java.util.Scanner;

public class HenkilotietojenTarkastelu {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        int ageSum = 0;
        int ageAmount = 0;

        int longestNameLength = 0;
        String longestName = "";
        String eldestName = "";

        while (true) {
            String usrInput = lukija.nextLine();
            if (usrInput.equals("")) {
                break;
            }

            String[] inputLine = usrInput.split(",");

            ageSum += Integer.valueOf(inputLine[1]);
            ageAmount++;
            if (inputLine[0].length() > longestNameLength) {
                longestNameLength = inputLine[0].length();
                longestName = inputLine[0];
            }
        }

        System.out.println("Pisin nimi: " + longestName);
        System.out.println("Syntymävuosien keskiarvo: " + ageSum * 1.0 / ageAmount);
    }
}