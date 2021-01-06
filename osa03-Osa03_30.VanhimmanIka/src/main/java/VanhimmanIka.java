
import java.util.Scanner;
import java.util.ArrayList;

public class VanhimmanIka {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> ages = new ArrayList<Integer>();

        int lukumaara = 0;

        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            String[] palat = luettu.split(",");
            ages.add(Integer.valueOf(palat[1]));
        }
        int eldest = ages.get(0);
        for (int i = 0; i < ages.size(); i++){
            if (ages.get(i) > eldest){
                eldest = ages.get(i);
            }
        }
        System.out.println("Vanhimman ikä: "+eldest);
    }
}