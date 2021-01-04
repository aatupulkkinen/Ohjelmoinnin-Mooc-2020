import java.util.ArrayList;
public class Hiekkalaatikko {

    public static void main(String[] args) {
        // Toteuta ohjelmasi tänne
        ArrayList<Integer> numerot = new ArrayList<>();

        numerot.add(2);
        numerot.add(6);
        numerot.add(5);
        numerot.add(3);

        numerot.remove(Integer.valueOf(2));

        for(Integer num: numerot){
            System.out.println(num);
        }
    }
}
