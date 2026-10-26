import java.util.ArrayList;
import java.util.List;

class Solution {
    // 1. Optimal Approach
    public List<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        List<Integer> union = new ArrayList<>();

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < arr1.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i]) union.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j]) union.add(arr2[j]);
            j++;
        }
        return union;
    }
}
