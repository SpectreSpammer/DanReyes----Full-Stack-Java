package day11_FileIO;

import java.io.*;

public class MainDeserialization {
    public static void main(String[] args) {

        EmployeeFileIO employee = null;

        try {
            FileInputStream fileInput = new FileInputStream("C:\\Users\\Mugiwara\\OneDrive\\Documents\\testing\\Dan.txt");
            ObjectInputStream objectInput = new ObjectInputStream(fileInput);
            employee =  (EmployeeFileIO) objectInput.readObject();
            objectInput.close();
            fileInput.close();

            System.out.println("Deserializing data in Dan.txt");
            System.out.println("First name: " + employee.name );
            System.out.println("Address: " + employee.address);


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error during deserialization " + e.getMessage());
            e.printStackTrace();
        }
    }
}
