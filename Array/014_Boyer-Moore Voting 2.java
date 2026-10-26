import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    // 1. Better Approach
    public List<Integer> majorityElementN3Better(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 3) res.add(entry.getKey());
        }
        return res;
    }

    // 2. Optimal Approach
    public List<Integer> majorityElementN3Optimal(int[] nums) {
        int count1 = 0, count2 = 0;
        Integer cand1 = null, cand2 = null;

        for (int num : nums) {
            if (cand1 != null && num == cand1) count1++;
            else if (cand2 != null && num == cand2) count2++;
            else if (count1 == 0) { cand1 = num; count1 = 1; }
            else if (count2 == 0) { cand2 = num; count2 = 1; }
            else { count1--; count2--; }
        }

        count1 = 0; count2 = 0;
        for (int num : nums) {
            if (cand1 != null && num == cand1) count1++;
            if (cand2 != null && num == cand2) count2++;
        }

        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if (count1 > n / 3) result.add(cand1);
        if (cand2 != cand1 && count2 > n / 3) result.add(cand2);

        return result;
    }
}
