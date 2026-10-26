class Test {

    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        Arrays.toString(arr);

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + end;

            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 8, 98, 34, 56, 77, 1, 66 };
        System.out.println(binarySearch(arr, 98));
    }
}
