package MyNewCode;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                String testString = "My name is <MyName>";

        // Заместване на <MyName> с текст от конзола

        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();

        String newString = testString.replaceAll("<MyName>", name);

        System.out.println("Original string: " + testString);
        System.out.println("New String: " + newString);

//        equal of strings

        System.out.println("Enter your string:");
       String random = scanner.nextLine();
       String random2 = scanner.nextLine();

        if(random.equals(random2)){
            System.out.println("\""+ random + "\"" + " is equal to " + "\"" + random2 + "\"");
        }
        else{
            System.out.println(random + " is not equal to " + random2);
        }

        }

// compare with 2 and 3 strings
public static void compareString(String[] args) {


    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter first string: ");
    String a = scanner.nextLine();
    System.out.println("Please enter second string: ");
    String b = scanner.nextLine();
    System.out.println("Please enter third string: ");
    String c = scanner.nextLine();

    String strConcatenation = a.concat(" " + b);
    System.out.println("The compare first and second strings: " + strConcatenation);

    String strConcatenation2 = a.concat(b + " " + c);
    System.out.println("The concatenated first, second and third strings: " + strConcatenation2);


    String testString = "My test string";
    System.out.println(testString.length());

    String [] stringArray = testString.split(" ");
    System.out.println( "\""+testString + "\"" + " has " + stringArray.length + " words.");
}







    }


