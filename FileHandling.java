import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LabExamPaulu {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                int numWords = words.length;

                System.out.println("Number of words: " + numWords);
                System.out.println("Words:");
                for (String word : words) {
                    System.out.println(word);
                }

                System.out.println("Words in reversed order:");
                for (int i = numWords - 1; i >= 0; i--) {
                    System.out.println(words[i]);
                }

                System.out.println("Singular words:");
                for (String word : words) {
                    if (!word.endsWith("s")) {
                        System.out.println(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
