package day9_exception.checkedException;

import java.io.FileNotFoundException;

public class MainChecked {
    public static void main(String[] args) throws FileNotFoundException {
        CheckedException.readFile("C:\\Users\\Mugiwara\\Desktop\\Test Folder");
        CheckedException.connectToDatabase();


    }
}
