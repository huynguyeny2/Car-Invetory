//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Choose an operation:");
//        System.out.println("1. Addition");
//        System.out.println("2. Subtraction");
//        System.out.println("3. Multiplication");
//        System.out.println("4. Division");
//        System.out.println("Please select your choice...:");
//        int choice = scanner.nextInt();
//
//        System.out.print("Enter the first number: ");
//        double num1 = scanner.nextDouble();
//
//        System.out.print("Enter the second number: ");
//        double num2 = scanner.nextDouble();
//
//        double result;
//
//        switch (choice) {
//            case 1:
//                result = num1 + num2;
//                System.out.println("Result: " + result);
//                break;
//
//            case 2:
//                result = num1 - num2;
//                System.out.println("Result: " + result);
//                break;
//
//            case 3:
//                result = num1 * num2;
//                System.out.println("Result: " + result);
//                break;
//
//            case 4:
//                if (num2 != 0) {
//                    result = num1 / num2;
//                    System.out.println("Result: " + result);
//                } else {
//                    System.out.println("Error: Division by zero is not allowed.");
//                }
//                break;
//
//            default:
//                System.out.println("Invalid choice. Please select a valid operation.");
//        }
//        scanner.close();
//
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//
//        final int countNum = 5;
//        double valuesSum = 0;
//        double valuesMax = Double.MIN_VALUE;
//        double valuesMin = Double.MAX_VALUE;
//        double valuesAverage = 0;
//        double interestValue = 0;
//        int i = 0;
//
//        while (i < countNum) {
//            System.out.print ("Please enter your number....: ");
//            double inputValue = scnr.nextDouble();
//            valuesSum += inputValue;
//
//            if (inputValue > valuesMax) {
//                valuesMax = inputValue;}
//            if (inputValue < valuesMin) {
//                valuesMin = inputValue;}
//
//            i++;
//        }
//        valuesAverage = (valuesSum / countNum);
//        interestValue = valuesSum*1.2;
//
//        System.out.println("The sum is: " + valuesSum);
//        System.out.println("The average is: " + valuesAverage);
//        System.out.println("The maximum is: " + valuesMax);
//        System.out.println("The minimum is: " + valuesMin);
//        System.out.printf("The interest value is %.2f%n", interestValue);
//    }
//}

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//
//        ArrayList<Double> temperatures = new ArrayList<>();
//        ArrayList<String> daysOfWeek = new ArrayList<>() {{
//            add("Monday");
//            add("Tuesday");
//            add("Wednesday");
//            add("Thursday");
//            add("Friday");
//            add("Saturday");
//            add("Sunday");
//        }};
//
//
//        int i;
//        double total = 0;
//        double max = Double.MIN_VALUE;
//        double min = Double.MAX_VALUE;
//
//        for (i = 0; i < daysOfWeek.size(); i++) {
//            System.out.print("Please enter the temperature in Fahrenheit for " + daysOfWeek.get(i) + ":");
//            double inputValue = scnr.nextDouble();
//            temperatures.add(inputValue);
//        }
//
//        System.out.println();
//        System.out.println("Temperature for the week: ");
//        System.out.println("Day of the week\t\tTemperature");
//        for (i = 0; i < daysOfWeek.size(); i++) {
//            System.out.printf ("%-12s\t\t%10.1f%n", daysOfWeek.get(i), temperatures.get(i));
//        }
//
//        for (double temp : temperatures) {
//            total += temp;
//            if (temp > max) {
//                max = temp;
//            }
//            if (temp < min) {
//                min = temp;
//            }
//        }
//
//        double average = total / temperatures.size();
//
//        System.out.println();
//        System.out.println("Temperature Analysis:");
//        System.out.println("Total: " + total);
//        System.out.println("Maximum: " + max);
//        System.out.println("Minimum: " + min);
//        System.out.println("Average: " + average);
//    }
//}

//
//
//public class Calav {
//    public static void main(String[] args) {
//        double[] x = {0, 1, 2, 3, 4, 5, 6};
//        double average = calculateAverage(x);
//        System.out.println(average);
//    }
//
//    public static double calculateAverage(double[] x) {
//        double sum = 0;
//        for (double value : x) {
//            sum += value;
//        }
//        return sum / x.length;
//    }
//}
public class Main {

    public static void main(String[] args) {
        CarInventory car = new CarInventory();
        car.mainLoop();
    }
}