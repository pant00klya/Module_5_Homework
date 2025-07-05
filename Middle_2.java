package Voskresenskaya.Module_5_Homework;

import java.util.Scanner;

public class Middle_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double[] array;
        double maxAbs = 0;
        System.out.println("Введите элементы массива от 1 до 100: ");
        n = scanner.nextInt();
        if (n > 100 || n < 1) {
            System.out.println("Неверный ввод");
        } else {
            array = new double[n];
            System.out.println("Введите значения массива: ");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextDouble();
            }
            for (int i = 1; i < array.length; i++) {
                if (Math.abs(array[i]) > maxAbs) {
                    maxAbs = Math.abs(array[i]);
                }
            }
            System.out.println("Максимальное значени массива по модулю = " + maxAbs);
        }
    }
}
