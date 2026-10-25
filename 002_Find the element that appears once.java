public class SingleNumber {
    
    public static int findSingleNumber(int[] nums) {
        int uniqueElement = 0;
        
        for (int num : nums) {
            // XOR each element with the running result
            uniqueElement ^= num;
        }
        
        return uniqueElement;
    }

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        
        int result = findSingleNumber(nums);
        System.out.println("The element that appears once is: " + result);
    }
}
