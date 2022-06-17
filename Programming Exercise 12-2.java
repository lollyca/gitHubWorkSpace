import java.util.*;

public class TryToParseDouble {
    public static void main(String[] args) {

        String input;
        double conversion = 0.0;
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);

        while (!quit) {
            try {
                System.out.print("Enter a floating point number (x.xx) >>");
                input = scanner.nextLine();
                conversion = Double.parseDouble(input);
                quit = true;
            } catch (NumberFormatException e) {
                System.out.println("The number you entered was not a floating point.");
                conversion = 0.0;
            } catch (NoSuchElementException f) {
                System.out.println("Value entered cannot be converted to a floating-point number");
            }
            System.out.println("Your floating point number: " + conversion);
        }
    }
}