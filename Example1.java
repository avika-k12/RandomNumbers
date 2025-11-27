public class Example1 {
    public static void main(String[] args){
        // Math.random() generates a decimal number between 0.0 and 1.0
        double randomValue = Math.random();
        System.out.println("Random double number between 0.0 and 1.0: " + randomValue);

        // To generate a random integer between 0 and 9
        int randomInt = (int)(Math.random() * 10); // We have to cast Math.random() to ensure the number generated is an integer number, not double
        System.out.println("Random integer between 0 and 9: " + randomInt);
    }
}
