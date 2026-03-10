import java.util.Scanner;

public class level2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a program to execute:");
        System.out.println("1. Basic Calculator");
        System.out.println("2. Area of Triangle");
        System.out.println("3. Side of Square");
        System.out.println("4. Distance Converter");
        System.out.println("5. Purchase Price");
        System.out.println("6. Quotient and Remainder");
        System.out.println("7. Integer Operations");
        System.out.println("8. Double Operations");

        System.out.print("Enter your choice (1-8): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                double number1, number2;

                System.out.print("Enter first number: ");
                number1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                number2 = sc.nextDouble();

                double addition = number1 + number2;
                double subtraction = number1 - number2;
                double multiplication = number1 * number2;
                double division = number1 / number2;

                System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                        + number1 + " and " + number2 + " is "
                        + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
                break;

            case 2:
                double base, height;

                System.out.print("Enter base in cm: ");
                base = sc.nextDouble();

                System.out.print("Enter height in cm: ");
                height = sc.nextDouble();

                double areaCm = 0.5 * base * height;
                double areaInch = areaCm / (2.54 * 2.54);

                System.out.println("The Area of the triangle in sq in is " + areaInch +
                        " and sq cm is " + areaCm);
                break;

            case 3:
                double perimeter;

                System.out.print("Enter perimeter: ");
                perimeter = sc.nextDouble();

                double side = perimeter / 4;

                System.out.println("The length of the side is " + side +
                        " whose perimeter is " + perimeter);
                break;

            case 4:
                double distanceInFeet;

                System.out.print("Enter distance in feet: ");
                distanceInFeet = sc.nextDouble();

                double yards = distanceInFeet / 3;
                double miles = yards / 1760;

                System.out.println("The distance in yards is " + yards +
                        " while the distance in miles is " + miles);
                break;

            case 5:
                double unitPrice;
                int quantity;

                System.out.print("Enter unit price: ");
                unitPrice = sc.nextDouble();

                System.out.print("Enter quantity: ");
                quantity = sc.nextInt();

                double totalPrice = unitPrice * quantity;

                System.out.println("The total purchase price is INR " + totalPrice +
                        " if the quantity " + quantity +
                        " and unit price is INR " + unitPrice);
                break;

            case 6:
                int num1, num2;

                System.out.print("Enter first number: ");
                num1 = sc.nextInt();

                System.out.print("Enter second number: ");
                num2 = sc.nextInt();

                int quotient = num1 / num2;
                int remainder = num1 % num2;

                System.out.println("The Quotient is " + quotient +
                        " and Reminder is " + remainder +
                        " of two number " + num1 + " and " + num2);
                break;

            case 7:
                int a, b, c;

                System.out.print("Enter value of a: ");
                a = sc.nextInt();

                System.out.print("Enter value of b: ");
                b = sc.nextInt();

                System.out.print("Enter value of c: ");
                c = sc.nextInt();

                int result1 = a + b * c;
                int result2 = a * b + c;
                int result3 = c + a / b;
                int result4 = a % b + c;

                System.out.println("The results of Int Operations are "
                        + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
                break;

            case 8:
                double da, db, dc;

                System.out.print("Enter value of a: ");
                da = sc.nextDouble();

                System.out.print("Enter value of b: ");
                db = sc.nextDouble();

                System.out.print("Enter value of c: ");
                dc = sc.nextDouble();

                double dresult1 = da + db * dc;
                double dresult2 = da * db + dc;
                double dresult3 = dc + da / db;
                double dresult4 = da % db + dc;

                System.out.println("The results of Double Operations are "
                        + dresult1 + ", " + dresult2 + ", " + dresult3 + ", and " + dresult4);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}