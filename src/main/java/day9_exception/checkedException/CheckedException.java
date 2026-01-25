package day9_exception.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckedException {

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        new Scanner(file);
    }

    public static void connectToDatabase() {
        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dandb","admin","admin");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        } finally {
            System.out.println("Closing the database.....");

        }

    }
}
