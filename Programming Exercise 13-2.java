import java.util.Scanner;
import java.nio.file.*;
import java.io.IOException;

public class CompareFolders {
    public static void main(String[] args) {
        // Write your code here
        String input;
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        Path filePath1 = Paths.get(input);
        input = keyboard.nextLine();
        Path filePath2 = Paths.get(input);
        input = keyboard.nextLine();
        Path filePath3 = Paths.get(input);

        try {
            String parent1 = filePath1.getParent().toString();
            String parent2 = filePath2.getParent().toString();
            String parent3 = filePath3.getParent().toString();

            if (parent1.equals(parent2) && parent2.equals(parent3)) {
                System.out.println("All files are in the same folder");
            } else {
                System.out.println("Files are not in the same folder");
            }

        } catch (Exception e) {
            System.out.println("IO Exception");
        }

    }
}