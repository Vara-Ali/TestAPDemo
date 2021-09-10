package com.company;
import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        System.out.println("Program to calculate student percentage!!!!!!");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for subject 1");
        int sub1 = sc.nextInt();
        System.out.println("Enter marks for subject 2");
        int sub2 = sc.nextInt();
        System.out.println("Enter marks for subject 3");
        int sub3 = sc.nextInt();
        System.out.println("Enter marks for subject 4");
        int sub4 = sc.nextInt();
        System.out.println("Enter marks for subject 5");
        int sub5 = sc.nextInt();

        float total = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.print("Total marks for all five subjects are: ");
        System.out.println(total);
        float div = (( total / 500 ) * 100 );
        System.out.print("Percentage: ");
        System.out.print(div);
        System.out.println("%");

    }
}
