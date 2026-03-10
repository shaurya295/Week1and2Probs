import java.util.*;
public class level1 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the problem you want to execute: ");
        int problemNumber = Sc.nextInt();

        switch(problemNumber) {
            case 1:
                System.out.println("Executing Problem 1");
                prob1();
                break;
            case 2:
                System.out.println("Executing Problem 2");
                prob2();
                break;
            case 3:
                System.out.println("Executing Problem 3");
                prob3();
                break;
            case 4:
                System.out.println("Executing Problem 4");
                prob4();
                break;
            case 5:
                System.out.println("Executing Problem 5");
                prob5();
                break;
            case 6:
                System.out.println("Executing Problem 6");
                prob6();
                break;
            case 7:
                System.out.println("Executing Problem 7");
                prob7();
                break;
            case 8:
                System.out.println("Executing Problem 8");
                prob8();
                break;
            case 9:
                System.out.println("Executing Problem 9");
                prob9();
                break;
            case 10:
                System.out.println("Executing Problem 10");
                prob10();
                break;
            default:
                System.out.println("Invalid problem number");
        }

    }
    public static void prob1() {
        System.out.println("Write a program to find the age of Harry if the birth year is 2000. Assume the Current Year is 2024");
        System.out.println("Ans.");
        System.out.println("Harry's age is " + (2024-2000));
    }
    public static void prob2() {
        System.out.println("Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM");
        System.out.println("Ans.");
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;
        System.out.println("Sam's average percent mark in PCM is " + average + "%");
    }
    public static void prob3() {
        System.out.println("Create a program to convert the distance of 10.8 kilometers to miles.");
        System.out.println("Ans.");
        double kilometers = 10.8;
        double miles = kilometers * 0.621371;
        System.out.println("The distance 10.8 km in miles is " + miles + " miles");
    }
    public static void prob4() {
        System.out.println("Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191.");
        System.out.println("Ans.");
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit / (double) costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
                           "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
    public static void prob5() {
        System.out.println("Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.");
        System.out.println("Ans.");
        int totalPens = 14;
        int students = 3;
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
    public static void prob6() {
        System.out.println("The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%.\nWrite a program to find the discounted amount and discounted price the student will pay for the course.");
        System.out.println("Ans.");
        double fee = 125000;
        double discountPercent = 10;
        double discountAmount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
    public static void prob7() {
        System.out.println("Write a Program to compute the volume of Earth in km^3 and miles^3");
        System.out.println("Ans.");
        double radiusKm = 6378.0;
        double volumeKm3 = (4.0/3.0) * Math.PI * Math.pow(radiusKm, 3);
        double kmToMiles = 0.621371;
        double radiusMiles = radiusKm * kmToMiles;
        double volumeMiles3 = (4.0/3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
    public static void prob8() {
        System.out.println("Create a program to convert distance in kilometers to miles (takes user input)");
        System.out.println("Ans.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
    public static void prob9() {
        System.out.println("Write a new program similar to prob6 but take user input for Student Fee and University Discount");
        System.out.println("Ans.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fee (INR): ");
        double fee = sc.nextDouble();
        System.out.print("Enter discount percent: ");
        double discountPercent = sc.nextDouble();
        double discountAmount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
    public static void prob10() {
        System.out.println("Write a program that takes your height in centimeters and converts it into feet and inches");
        System.out.println("Ans.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height in centimeters: ");
        double heightCm = sc.nextDouble();
        double totalInches = heightCm / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches - (feet * 12);
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
    }
}