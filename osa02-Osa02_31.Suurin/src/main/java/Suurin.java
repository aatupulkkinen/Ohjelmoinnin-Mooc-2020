
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        int largest = luku1;
        if (luku2 > largest) {
            largest = luku2;
        }
        if (luku3 > largest) {
            largest = luku3;
        }
        return largest;
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
