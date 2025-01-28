import java.util.Scanner;

public class ASCIIValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0); // Intentional error: Accessing the second character

        // Get the ASCII value of the character
        int asciiValue = (int) character;

        // Display the result
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

        scanner.close();
    }
}