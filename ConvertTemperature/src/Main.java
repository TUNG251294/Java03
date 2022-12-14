import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit");
                    fahrenheit = scanner.nextDouble();
                    System.out.println(toCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius");
                    celsius = scanner.nextDouble();
                    System.out.println(toFahrenheit(celsius));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
        public static double toCelsius(double fahrenheit){
            double celsius = (5.0/9)*(fahrenheit - 32);
            return celsius;
        }
        public static double toFahrenheit(double celsius){
            double fahrenheit = celsius*9.0/5 + 32;
            return fahrenheit;
        }
    }
}