package Voskresenskaya.Module_5_Homework;

import java.util.Scanner;

public class Middle_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f;
        System.out.println("Put in a number");
        f = scanner.nextInt();
        if (f < 0) {
            System.out.println("Factorial wasn't found.");
        }
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        System.out.println("Factorial of input number = " + result);
    }
}
