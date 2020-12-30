
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class ViestiKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Kirjoita merkkijono!");
        // toteuta ohjelma tänne
        String msg = lukija.nextLine();
        
        for(int i = 0; i<3; i++ ){
            System.out.println(msg);
        }

    }
}

