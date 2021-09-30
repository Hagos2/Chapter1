package Assignment1;

import java.util.Scanner;

public class FindName {
    public static void main(String[] args) {
        String Firstname, Middlename, Lastname;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first name middle name and last name");
        Firstname = keyboard.next();
        Middlename = keyboard.next();
        Lastname = keyboard.next();
        System.out.print(Firstname + " "+ Middlename.charAt(0) + "." + Lastname);
    }
}