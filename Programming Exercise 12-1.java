import java.util.*;

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = { "Ariel", "Brad", "Clifford", "Denise", "Emily",
                "Fred", "Gina", "Henry" };
        Scanner keyboard = new Scanner(System.in);
        int number;

        // your code here
        System.out.println("Enter a number, and I will display a name ");
        number = keyboard.nextInt();

        try {
            System.out.println("Name is " + names[number]);
        } catch (Exception e) {
            System.out.println("Subscript out of range.");
        }
    }
}