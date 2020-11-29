import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static Scanner input;
    private static final String filePath = "C:/Users/user/IdeaProjects/LettersMaven/src/main/resources/output.txt";
    private static final int[] count = new int[26];
    private static int totalLetters;
    private static String message = "Letters in file: ";

    public static void main(String[] args) {
        takeFile();
    }

    public static void takeFile() {
        try {
            input = new Scanner(new File(filePath));
        } catch (FileNotFoundException e) {
            System.out.println("Can`t find file");
        }
        takeLetters();
    }

    public static void takeLetters() {
        while (input.hasNextLine()) {
            String answer = input.nextLine();
            answer = answer.toLowerCase();
            char[] characters = answer.toCharArray();
            for (char character : characters) {
                if ((character >= 'a') && (character <= 'z')) {
                    count[character - 'a']++;
                }
                totalLetters++;
            }
        }
        makeResult();
    }

    public static void makeResult() {
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i + 'a'));
            System.out.println(": " + count[i]);
        }
        System.out.println(message + totalLetters);
        input.close();
    }

    public static String getMessage() {
        return message;
    }

    static String getFilePath() {
        return filePath;
    }

    public static int getTotalLetters() {
        return totalLetters;
    }
}