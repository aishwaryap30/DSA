import java.util.HashSet;
import java.util.Set;

class Solution {
    // 1. Brute Force Approach
    public int removeDuplicatesBrute(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int index = 0;
        for (int num : set) {
            nums[index++] = num;
        }
        return set.size();
    }

    // 2. Optimal Approach
    public int removeDuplicatesOptimal(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
