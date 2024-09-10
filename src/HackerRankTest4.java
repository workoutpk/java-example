import java.util.Arrays;
import java.util.List;

public class HackerRankTest4 {

        // Assuming the stacks are represented as arrays of integers
        public static int equalStacks(int[] h1, int[] h2, int[] h3) {
                // Calculate the sum of heights for each stack
                int sum1 = Arrays.stream(h1).sum();
                int sum2 = Arrays.stream(h2).sum();
                int sum3 = Arrays.stream(h3).sum();
                // Initialize the indices for each stack
                int i1 = 0;
                int i2 = 0;
                int i3 = 0;
                // Loop until the sums are equal or any stack is empty
                while (!(sum1 == sum2 && sum2 == sum3) && i1 < h1.length && i2 < h2.length && i3 < h3.length) {
                        // Find the maximum sum among the three stacks
                        int maxSum = Math.max(sum1, Math.max(sum2, sum3));
                        // Remove the top element from the stack with the maximum sum
                        if (maxSum == sum1) {
                                sum1 -= h1[i1];
                                i1++;
                        } else if (maxSum == sum2) {
                                sum2 -= h2[i2];
                                i2++;
                        } else {
                                sum3 -= h3[i3];
                                i3++;
                        }
                }
                // Return the common sum or 0 if any stack is empty
                return Math.min(sum1, Math.min(sum2, sum3));
        }



        public static void main(String[] args) {
                List<Integer> list = Arrays.asList(1,2,11);
                int sum = list.stream().reduce((a,b)->a+b).get();
                System.out.println("Sum is  :: " +sum);
                // Example input
                int[] h1 = {3, 2, 1, 1, 1};
                int[] h2 = {4, 3, 2};
                int[] h3 = {1, 1, 4, 1};

                // Example output
                System.out.println(equalStacks(h1, h2, h3)); // prints 5
        }
}
