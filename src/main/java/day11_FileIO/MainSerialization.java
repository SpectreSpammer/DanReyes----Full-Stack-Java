package day11_FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class MainSerialization {
    public static void main(String[] args) {

        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());
        EmployeeFileIO employee = new EmployeeFileIO();
        employee.name = "Dan";
        employee.address = "Leyte";

        try {
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\Mugiwara\\OneDrive\\Documents\\testing\\Dan.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(employee);
            objectOutput.close();
            fileOutput.close();
            System.out.println("Serialized Ddata is saved as Dan.txt");
            LOGGER.info("The file has been created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
