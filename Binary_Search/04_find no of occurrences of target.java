import java.util.Arrays;

class CountOccurrences {

    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1; // Look further left
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }


    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; // Look further right
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void countAllOccurrences(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        
        while (i < arr.length) {
            int currentVal = arr[i];
            int first = findFirst(arr, currentVal);
            int last = findLast(arr, currentVal);
            int count = (last - first) + 1;
            
            System.out.println("Element " + currentVal + " appears " + count + " time(s).");
            
            // Skip past all duplicates to the next unique element
            i = last + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 4, 3, 2, 4, 1, 3 };
        countAllOccurrences(arr);
    }
}
