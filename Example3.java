import java.util.Random;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args){
        Random rand = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@!#()-\"";
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many letters do you want in your password? -> ");
        int lengthOfPassword = sc.nextInt();

        for (int i = 0; i < lengthOfPassword; i++){
            int index = rand.nextInt(alphabet.length());
            sb.append(alphabet.charAt(index));
        }

        System.out.println("Your password: " + sb.toString());
    }
}
