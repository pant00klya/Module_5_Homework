package Voskresenskaya.Module_5_Homework;

import java.util.Scanner;

public class Middle_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f;
        do {
            System.out.println("Put in a number");
            f = scanner.nextInt();
        } while (f <= 0 );
        int res = 1;
        for (int i = 1; i <= f; i++) {
            res = res * i;
        }
        System.out.println("Factorial of input number = " + res);
    }
}
