package Bai3;
import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double C;
        double F;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");

            System.out.println("Enter your choice");
             choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter F: ");
                    F=sc.nextDouble();
                    System.out.println("result: "+ fahrenheitToCelcius( F));
                    break;
                case 2:
                    System.out.println("enter C: ");
                    C=sc.nextDouble();
                    System.out.println("result: "+ celsiusToFahrenheit( C));
                    break;
                case 0:
                    System.exit(0);

            }

        }
        while (choice !=0);

    }
    public static double celsiusToFahrenheit(double C){//ham chuyen do C sang do F
        double F=C*1.8+32;
        return F;
    }
    public  static double fahrenheitToCelcius(double F){
        double C=(F-32)/1.8;
        return  C;
    }
}

