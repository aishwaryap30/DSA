class Solution {
    // 1. Brute Force Approach
    public int missingNumberBrute(int[] nums, int N) {
        for (int i = 1; i <= N; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) return i;
        }
        return -1;
    }

    // 2. Better Approach
    public int missingNumberSum(int[] nums, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }

    // 3. Optimal Approach
    public int missingNumberXOR(int[] nums, int N) {
        int xor1 = 0;
        int xor2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor2 ^= nums[i];
            xor1 ^= (i + 1);
        }
        xor1 ^= N;
        return xor1 ^ xor2;
    }
}
