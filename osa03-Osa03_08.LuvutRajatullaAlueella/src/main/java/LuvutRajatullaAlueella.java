
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        System.out.println("Mistä?");
        int start = Integer.valueOf(lukija.nextLine());
        System.out.println("Mihin?");
        int stop = Integer.valueOf(lukija.nextLine());
        
        while(start <= stop){
            System.out.println(luvut.get(start));
            start++;
        }
    }
}
