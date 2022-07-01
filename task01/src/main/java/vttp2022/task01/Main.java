package vttp2022.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
        Scanner n = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("Enter first name: ");
        firstName = n.next();

        System.out.println("Enter last name: ");
        lastName = n.next();

        String Username = firstName + lastName;
        System.out.println(Username);

        n.close();

    }
}