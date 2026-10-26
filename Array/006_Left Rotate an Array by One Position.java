class Solution {
    // 1. Brute Force Approach
    public void leftRotateByOneBrute(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;
        int[] temp = new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = nums[i];
        }
        temp[n - 1] = nums[0];
        System.arraycopy(temp, 0, nums, 0, n);
    }

    // 2. Optimal Approach
    public void leftRotateByOneOptimal(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;
        int temp = nums[0];
        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }
        nums[n - 1] = temp;
    }
}
