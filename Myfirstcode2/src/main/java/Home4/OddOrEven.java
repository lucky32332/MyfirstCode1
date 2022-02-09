package Home4;

public class OddOrEven {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int even = 0, odd = 0;

        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
            if (i % 3 == 0)
                odd += arr[i];
            else
                even += arr[i];
        }

        System.out.println("Odd index positions sum: " + odd);
        System.out.println("Even index positions sum: " + even);

    }
}
