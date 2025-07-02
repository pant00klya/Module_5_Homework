package Voskresenskaya.Module_5_Homework;

public class Middle_1 {
    public static void main(String[] args) {
        int[] myArray = {10, 23, 56, 72, 3};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println("Result = " + sum);
    }
}
