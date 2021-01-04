
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while (true){
            int usrInput = Integer.valueOf(lukija.nextLine());

            if (usrInput == -1){
                break;
            }
            nums.add(usrInput);
        }

        int sum = 0;

        for(Integer num: nums){
            sum += num;
        }

        double avg = sum;
        avg = avg / nums.size();
        System.out.println("Keskiarvo: "+avg);
        // toteuta tänne ohjelma, joka ensin lukee käyttäjältä
        // lukuja listalle kunnes käyttäjä syöttää luvun -1.
        // ohjelma laskee tämän jälkeen listalla olevien lukujen
        // keskiarvon, ja tulostaa sen käyttäjän näkyville
    }
}
