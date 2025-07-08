package Voskresenskaya.Module_5_Homework;

import java.util.Scanner;

public class Middle_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Введите любое натуральное число от 1 до 100: ");
        n = scanner.nextInt();
        if (n > 100 || n < 1) {
            System.out.println("Неверный ввод");
        } else {
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ": ");
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.print(j + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
