package Home4;

import java.util.Scanner;

public class NumsFrom1ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arrays = new int[n];
        for (int i=0; i <n ; i++){
            arrays[i] = scanner.nextInt();
        }
        System.out.println(java.util.Arrays.toString(arrays));


    }

}

