package Home4;

import java.util.Scanner;

public class FibonachiNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);{
          int n = Integer.parseInt(scanner.nextLine());
          int k = Integer.parseInt(scanner.nextLine());


            int[] nums = new int[n];
            nums[0] = 1;
            for (int i = 1; i < n ; i++) {
                int sum = 0;
                for (int prev = i - k; prev < i ; prev++) {
                    if (prev >= 0){
                        sum += nums[prev];
                        nums [i] = sum;
                    }
                }
                for (int j = 0; j < n; j++) {
                    System.out.println(nums[i]);

                }

            }


        }
    }
}
