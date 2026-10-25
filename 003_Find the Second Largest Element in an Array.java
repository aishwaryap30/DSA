import java.util.Arrays;

class Solution {
    //  Brute Force Approach
    public int getSecondLargestBrute(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1;
        Arrays.sort(nums);
        
        int largest = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                return nums[i];
            }
        }
        return -1;
    }


    //  Optimal Approach
    public int getSecondLargestOptimal(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }
}
