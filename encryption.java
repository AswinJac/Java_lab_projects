import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        File outputFile = new File("output.txt");

        try (FileWriter writer = new FileWriter(outputFile)) {
            String[] words = inputString.split(" ");
            for (String word : words) {
                StringBuilder encryptedWord = new StringBuilder();
                for (int i = 0; i < word.length(); i++) {
                    char originalChar = Character.toUpperCase(word.charAt(i));
                    char encryptedChar = (char) (originalChar + 2);
                    if (encryptedChar > 'Z') {
                        encryptedChar -= 26; // Wrap around to 'A'
                    }
                    encryptedWord.append(encryptedChar);
                }
                writer.write(encryptedWord.toString() + " ");
            }
            System.out.println("Encryption completed. Encrypted text written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
