class Solution {
    // 1. Brute Force Approach
    public void moveZeroesBrute(int[] nums) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            if (num != 0) temp.add(num);
        }
        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }
        for (int i = temp.size(); i < nums.length; i++) {
            nums[i] = 0;
        }

    //optimal
    public static void removeZero(int[] arr) {

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        while (j < arr.length) {
            arr[i] = 0;
            j++;
        }
    }
}
