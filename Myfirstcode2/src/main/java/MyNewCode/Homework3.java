package MyNewCode;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());

        switch(day)

       {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Error");
                break;
        }
//              positive or negative
            int number4 = Integer.parseInt(scanner.nextLine());
            int number5 = Integer.parseInt(scanner.nextLine());
            if(number4 > number5) {
                System.out.println("Positive");
            }
            else{
                System.out.println("Negative");
            }
//        bigger number
        double number = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        double number3 = Double.parseDouble(scanner.nextLine());
        if (number > number2) {
            System.out.println("Number is greather than number 2");
        }
        else if (number2 > number3) {
            System.out.println("Number2 is greather than number 3");
            }
        else{
            System.out.println("Invalid combination");
                }
//            double length = Double.parseDouble(scanner.nextLine());
//            double higt = Double.parseDouble(scanner.nextLine());
//            if (length < higt) {
//                double total = length *= higt;
//                System.out.println("total");
//            } else {
//                double currentTotal = 2 * (length + higt);
//                System.out.println("currentTotal");
//            }


        }


    }



