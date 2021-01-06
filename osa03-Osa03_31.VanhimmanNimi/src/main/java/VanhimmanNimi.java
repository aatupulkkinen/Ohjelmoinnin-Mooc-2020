
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        int eldestAge = 0;
        String eldestName = "";

        while (true) {
            String usrInput = lukija.nextLine();
            if (usrInput.equals("")) {
                break;
            }
 
            String[] inputLine = usrInput.split(",");

            int inputAge = Integer.valueOf(inputLine[1]);
            if (inputAge > eldestAge) {
                eldestAge = inputAge;
                eldestName = inputLine[0];
            }
        }
 
        System.out.println("Vanhimman nimi: " + eldestName);
 
    }
}