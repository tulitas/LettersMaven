import java.io.*;

public class Main {
    private static final int[] count = new int[26];
    private static int totalLetters;
    private static final String message = "Letters in file: ";
    private static InputStream input;
    private static final String fileName = "output.txt";

    public static void main(String[] args) throws IOException {
        takeFile(fileName);
    }

    public static void takeFile(String file) throws IOException {
        input = Main.class.getResourceAsStream(fileName);
        takeLetters(totalLetters);
    }

    public static void takeLetters(int totalLettersInFile) throws IOException {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String line = null;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                char[] characters = line.toCharArray();
                for (char character : characters) {
                    if ((character >= 'a') && (character <= 'z')) {
                        count[character - 'a']++;
                    }
                    totalLetters++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        makeResult();
    }

    public static void makeResult() throws IOException {
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

    public static int getTotalLetters() {
        return totalLetters;
    }

    public static String getFileName() {
        return fileName;
    }
}