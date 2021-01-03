
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        int smallest = 0;
        if (luku1 > luku2) {
            smallest = luku2;
        } else {
            smallest = luku1;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
