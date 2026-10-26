class Solution {
    // 1. Better Approach
    public void sortColorsBetter(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int num : nums) {
            if (num == 0) c0++;
            else if (num == 1) c1++;
            else c2++;
        }
        int idx = 0;
        for (int i = 0; i < c0; i++) nums[idx++] = 0;
        for (int i = 0; i < c1; i++) nums[idx++] = 1;
        for (int i = 0; i < c2; i++) nums[idx++] = 2;
    }

    // 2. Optimal Approach
    public void sortColorsOptimal(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
