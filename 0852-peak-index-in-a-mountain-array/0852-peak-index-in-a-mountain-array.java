class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int ans =0;
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is on the increasing slope
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
                  // Peak is to the right
            } else {
                right = mid; 
                ans = mid;    // Peak is at mid or to the left
            }
        }
        ans = left;
        return ans; // or right, both point to the peak
    }
}
