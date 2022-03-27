package com.company;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        System.out.println("Введите предполагаемое число");

        checkNumber(3);
    }

    public static void checkNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        String text1 = "Загадочное число равно";
        String text2 = "Попробуй еще раз";
        int a = scanner.nextInt();
        while(true){

            int b = scanner.nextInt();

            if (a != b){
                System.out.println(text2);
                b = a ;}
            else
                System.out.println(text1 + b);
            break;

        }

    }
}


