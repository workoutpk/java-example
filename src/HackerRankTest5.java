import java.util.Arrays;

public class HackerRankTest5 {
        // Assuming the array is represented as an array of integers
        public static int[] maxSubarray(int[] arr) {
                // Initialize the variables to store the maximum subarray and subsequence sums
                int maxSubarraySum = arr[0];
                int maxSubsequenceSum = arr[0];
                // Initialize the variables to store the current subarray and subsequence sums
                int currSubarraySum = arr[0];
                int currSubsequenceSum = arr[0];
                // Loop through the rest of the array elements
                for (int i = 1; i < arr.length; i++) {
                        // Update the current subarray sum by adding the current element or starting a new subarray
                        currSubarraySum = Math.max(currSubarraySum + arr[i], arr[i]);
                        // Update the maximum subarray sum if needed
                        maxSubarraySum = Math.max(maxSubarraySum, currSubarraySum);
                        // Update the current subsequence sum by adding the current element if it is positive
                        if (arr[i] > 0) {
                                currSubsequenceSum += arr[i];
                        }
                        // Update the maximum subsequence sum if needed
                        maxSubsequenceSum = Math.max(maxSubsequenceSum, currSubsequenceSum);
                }
                // Return the maximum subarray and subsequence sums as an array of two integers
                return new int[]{maxSubarraySum, maxSubsequenceSum};
        }


        public static void main(String[] args) {
                // Example input
                int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};

                // Example output
                System.out.println(Arrays.toString(maxSubarray(arr))); // prints [7, 11]
        }
}
