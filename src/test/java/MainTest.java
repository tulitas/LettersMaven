import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final int lettersInMain = Main.getTotalLetters();
    private final String fileName = "output.txt";

    @org.junit.jupiter.api.Test
    void takeFile() throws IOException {
        Main.takeFile(fileName);
        assertEquals(fileName, Main.getFileName());
    }

    @org.junit.jupiter.api.Test
    void takeLetters() throws IOException {
        int totalLettersInFile = 680725;
        Main.takeFile(fileName);
        Main.takeLetters(totalLettersInFile);
        assertEquals(totalLettersInFile, Main.getTotalLetters());
    }
}