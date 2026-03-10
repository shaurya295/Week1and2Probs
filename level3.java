import java.util.Scanner;

public class level3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select a Program (1-11)");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Total Income");
        System.out.println("4. Travel Distance and Time");
        System.out.println("5. Swap Two Numbers");
        System.out.println("6. Athlete Rounds in Triangular Park");
        System.out.println("7. Chocolates Distribution");
        System.out.println("8. Simple Interest");
        System.out.println("9. Pounds to Kilograms");
        System.out.println("10. Maximum Handshakes");
        System.out.println("11. Pounds to Kilograms (Duplicate)");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = sc.nextDouble();
                double fahrenheitResult = (celsius * 9 / 5) + 32;
                System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsiusResult = (fahrenheit - 32) * 5 / 9;
                System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
                break;

            case 3:
                System.out.print("Enter salary: ");
                double salary = sc.nextDouble();

                System.out.print("Enter bonus: ");
                double bonus = sc.nextDouble();

                double income = salary + bonus;

                System.out.println("The salary is INR " + salary +
                        " and bonus is INR " + bonus +
                        ". Hence Total Income is INR " + income);
                break;

            case 4:
                sc.nextLine();

                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter from city: ");
                String fromCity = sc.nextLine();

                System.out.print("Enter via city: ");
                String viaCity = sc.nextLine();

                System.out.print("Enter destination city: ");
                String toCity = sc.nextLine();

                System.out.print("Enter distance from city to via city (miles): ");
                double fromToVia = sc.nextDouble();

                System.out.print("Enter distance from via city to final city (miles): ");
                double viaToFinalCity = sc.nextDouble();

                System.out.print("Enter time from city to via city (minutes): ");
                double timeFromToVia = sc.nextDouble();

                System.out.print("Enter time from via city to final city (minutes): ");
                double timeViaToFinalCity = sc.nextDouble();

                double totalDistance = (fromToVia + viaToFinalCity) * 1.609; 
                double totalTime = timeFromToVia + timeViaToFinalCity;

                System.out.println("The Total Distance travelled by " + name +
                        " from " + fromCity + " to " + toCity +
                        " via " + viaCity + " is " + totalDistance +
                        " km and the Total Time taken is " + totalTime + " minutes");
                break;

            case 5:
                System.out.print("Enter first number: ");
                int number1 = sc.nextInt();

                System.out.print("Enter second number: ");
                int number2 = sc.nextInt();

                int temp = number1;
                number1 = number2;
                number2 = temp;

                System.out.println("The swapped numbers are " + number1 + " and " + number2);
                break;

            case 6:
                System.out.print("Enter side1 of triangle (meters): ");
                double side1 = sc.nextDouble();

                System.out.print("Enter side2 of triangle (meters): ");
                double side2 = sc.nextDouble();

                System.out.print("Enter side3 of triangle (meters): ");
                double side3 = sc.nextDouble();

                double perimeter = side1 + side2 + side3;
                double rounds = 5000 / perimeter;

                System.out.println("The total number of rounds the athlete will run is " +
                        rounds + " to complete 5 km");
                break;

            case 7:
                System.out.print("Enter number of chocolates: ");
                int numberOfChocolates = sc.nextInt();

                System.out.print("Enter number of children: ");
                int numberOfChildren = sc.nextInt();

                int chocolatesEach = numberOfChocolates / numberOfChildren;
                int remainingChocolates = numberOfChocolates % numberOfChildren;

                System.out.println("The number of chocolates each child gets is " +
                        chocolatesEach +
                        " and the number of remaining chocolates are " +
                        remainingChocolates);
                break;

            case 8:
                System.out.print("Enter principal: ");
                double principal = sc.nextDouble();

                System.out.print("Enter rate: ");
                double rate = sc.nextDouble();

                System.out.print("Enter time: ");
                double time = sc.nextDouble();

                double simpleInterest = (principal * rate * time) / 100;

                System.out.println("The Simple Interest is " + simpleInterest +
                        " for Principal " + principal +
                        ", Rate of Interest " + rate +
                        " and Time " + time);
                break;

            case 9:
                System.out.print("Enter weight in pounds: ");
                double pounds = sc.nextDouble();

                double kg = pounds / 2.2;

                System.out.println("The weight of the person in pounds is " +
                        pounds + " and in kg is " + kg);
                break;

            case 10:
                System.out.print("Enter number of students: ");
                int numberOfStudents = sc.nextInt();

                int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

                System.out.println("The maximum number of possible handshakes is " + handshakes);
                break;

            case 11:
                System.out.print("Enter weight in pounds: ");
                double weight = sc.nextDouble();

                double kilograms = weight / 2.2;

                System.out.println("The weight of the person in pound is " +
                        weight + " and in kg is " + kilograms);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}