class Solution {
    // 1. Brute Force Approach
    public int maxDiffBrute(int[] nums) {
        int maxDiff = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    maxDiff = Math.max(maxDiff, nums[j] - nums[i]);
                }
            }
        }
        return maxDiff;
    }

    // 2. Optimal Approach
    public int maxDiffOptimal(int[] nums) {
        if (nums.length < 2) return -1;
        int minElement = nums[0];
        int maxDiff = -1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > minElement) {
                maxDiff = Math.max(maxDiff, nums[j] - minElement);
            }
            minElement = Math.min(minElement, nums[j]);
        }
        return maxDiff;
    }
}
