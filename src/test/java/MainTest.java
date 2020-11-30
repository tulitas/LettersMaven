import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void takeFile() throws IOException {

        String fileName = "output.txt";
        Main.takeFile(fileName);
        assertEquals(fileName, Main.getFileName());
        int totalLettersInFile = 680725;
        assertEquals(totalLettersInFile, Main.getTotalLetters());
    }
}