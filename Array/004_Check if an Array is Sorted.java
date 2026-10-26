class Solution {
    // 1. Brute Force Approach
    public boolean isSortedBrute(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // 2. Optimal Approach
    public boolean isSortedOptimal(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
