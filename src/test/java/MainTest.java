import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private int lettersInMain  = Main.getTotalLetters();
    @org.junit.jupiter.api.Test
    void takeFile() {
        String filePth = "C:/Users/user/IdeaProjects/LettersMaven/main/src/resources/output.txt";
        assertEquals(filePth, Main.getFilePath());
    }

    @org.junit.jupiter.api.Test
    void takeLetters() {
        int lettersInFile = 0;
        int lettersInMain  = Main.getTotalLetters();
        assertEquals(lettersInFile, lettersInMain);
    }

    @org.junit.jupiter.api.Test
    void makeResult() {
        String result = "Letters in file: ";
        assertEquals(result + lettersInMain, Main.getMessage() + lettersInMain);
    }
}