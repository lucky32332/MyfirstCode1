package Home4;

import java.util.Scanner;

public class OddOrEvenConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
            if(n % 3 != 0 && n % 7 != 0);{

            }
            System.out.println(java.util.Arrays.toString(array));



        }
    }
}
