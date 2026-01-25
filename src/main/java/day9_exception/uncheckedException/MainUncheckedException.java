package day9_exception.uncheckedException;

public class MainUncheckedException {
    public static void main(String[] args) {

        /*
        try{
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("caught: " + e.getMessage());
        }
        */

        /*
        String name = null;
        System.out.println("The length of name is: " + name.length());
        */

        int [] arr = new int [5];
        System.out.println(arr[6]);
    }
}
