package Voskresenskaya.Module_5_Homework;

import java.util.Random;
import java.util.Scanner;

public class Middle_6 {
    public static void main(String[] args) {
        int r = 5;
        for (int i = 0; i < r; i++) {
            int a = Math.abs(new Random().nextInt()) % 10;
            int b = Math.abs(new Random().nextInt()) % 10;
            int c = a * b;
            int inputNumber = 1;
            System.out.println("Сколько будет " + a + "*" + b + "?");
            while (inputNumber != c) {
                Scanner scanner = new Scanner(System.in);
                inputNumber = scanner.nextInt();
                if (inputNumber != c) {
                    System.out.println("Решение неверно. " + a + "*" + b + "=" + c);
                    break;
                } else {
                    System.out.println("Решение верно!");
                }

            }
        }
    }
}
