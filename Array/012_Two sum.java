class Solution {
    // 1. Brute Force Approach
    public int[] twoSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};


      //optimal 
       public static boolean _2sum(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                start++;
            } else if (sum > target) {
                end--;
            }
        }
        return false;
    }
      
    }
