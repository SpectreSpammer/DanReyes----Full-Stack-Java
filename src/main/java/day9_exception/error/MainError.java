package day9_exception.error;

import java.util.ArrayList;
import java.util.List;

public class MainError {
    public static void main(String[] args) {

        /*
        try{
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            System.out.println("Caught: " + e.getMessage());;
        }
        */

        outOfMemoryError();
    }

    private static void outOfMemoryError() {
        List<byte[]> listOfbytes = new ArrayList<>();
        while (true){
            listOfbytes.add(new byte[1024 * 1024]);
        }
    }

    private static void recursiveMethod(int i) {
        System.out.println(i);
        recursiveMethod(i + 1);
    }
}
