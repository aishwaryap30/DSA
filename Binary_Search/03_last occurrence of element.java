class Test{
  public static int find_last(arr, target){
    left, right = 0, len(arr) - 1
    result = -1
    while left <= right:
        mid = left + (right - left) // 2
        if arr[mid] == target:
            result = mid
            left = mid + 1   # Keep looking right
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return result
  }
}
