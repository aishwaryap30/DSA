import java.util.HashSet;
import java.util.Set;

class Solution {
    // 1. Optimal Approach
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);

        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) resultSet.add(num);
        }

        int[] res = new int[resultSet.size()];
        int idx = 0;
        for (int num : resultSet) res[idx++] = num;
        return res;
    }
}
