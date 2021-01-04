
import java.util.ArrayList;
import java.util.Scanner;

public class PienimmanLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();

        while(true){
            int usrInput = Integer.valueOf(lukija.nextLine());
             

             if(usrInput == 9999){
                 break;
             }
             nums.add(usrInput);
        }
        int smallest = nums.get(0);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < smallest){
                smallest = nums.get(i);
            }
        }
        System.out.println("Pienin luku on "+smallest);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == smallest){
                System.out.println("Pienin luku löytyy indeksistä "+i);
            }
        }
    }
}
