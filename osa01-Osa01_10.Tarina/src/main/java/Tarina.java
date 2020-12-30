
import java.util.Scanner;

public class Tarina {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kerron kohta tarinan, mutta tarvitsen siihen hieman tietoja.");
        System.out.println("Minkä niminen tarinassa esiintyvä hahmo on?");
        String name = lukija.nextLine();
        System.out.println("Mikä hahmon ammatti on?");
        String profession = lukija.nextLine();
        System.out.println("Tässä tarina:\nOlipa kerran "+name+", joka oli ammatiltaan "+profession+".\n"
                +"Matkatessaan töihin, "+name+" mietti arkeaan.\nEhkäpä "+name+" ei olekaan koko elämäänsä "+profession+".");
        
    }
}
