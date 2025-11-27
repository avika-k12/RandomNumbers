import java.util.Random;

public class Example2 {
    public static void main(String[] args){
        Random rand = new Random(); //Instantiation

        // Random integer
        int randomInt = rand.nextInt(10);
        System.out.println("Random integer between 0 and 9: " + randomInt);

        // Random double
        double randomDouble = rand.nextDouble();
        System.out.println("Random double: " + randomDouble);

        // Random boolean
        boolean randomBool = rand.nextBoolean();
        System.out.println("Random boolean: " + randomBool);
    }
}
