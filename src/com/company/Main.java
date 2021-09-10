package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int age = 65;
        float app = 4.555f;

        //System.out.println("Taking input from the user");
       // Scanner sc = new Scanner(System.in);
        // SUM OF 2 NUMBERS
        /*
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The sum of two numbers is ");
        System.out.println(c);
        */

        //boolean b = sc.hasNextInt();
        //System.out.println(b);
        //String str = sc.nextLine();
        //System.out.println(str);

        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Good Morning " + str + " , have a nice day");




    }
}
