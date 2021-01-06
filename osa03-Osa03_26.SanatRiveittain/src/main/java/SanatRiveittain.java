import java.util.Scanner;
 
public class SanatRiveittain {
 
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
 
        while (true){
            String strng = lukija.nextLine();
            if(strng.equals("")){
                break;
            } else{
                String [] line = strng.split(" ");
 
                for(int i = 0; i < line.length; i++){
                    System.out.println(line[i]);
                }
            }
            
        }
    }
}