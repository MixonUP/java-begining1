package company.common;

import java.util.Scanner;

class HelloWorld{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();
        System.out.println("Enter your surname");
        String surname = input.next();

        System.out.println("name " +name);
        System.out.println("surname " +surname);

//        System.out.println("Enter a sum");
//        double sum = input.nextDouble();
//        System.out.println("Enter a curs");
//        double curs = input.nextDouble();

//        System.out.println("sum in rub = " +sum*curs);

//        System.out.println("Enter a digit");
//        int a = input.nextInt();
//        System.out.println("a = "+a);




    }
}

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        boolean isLow = (bodyTemperature < 36);
        boolean isHigh = (bodyTemperature > 37);
        if (isHigh == true) {
            System.out.println("температура тела высокая");
        } else if (isLow == true){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}