class Test {

    public static int firstOccurrence(int[] arr, int target) {
        int index = 0;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + end;

            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    } 
}
