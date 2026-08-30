class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int index =-1;
        int index2 =-1;
      for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                index2 = i;
            }
        }
   int left = Math.max(index, index2) + 1;  // remove from front extra 1 for elements not index
        int right = n - Math.min(index, index2);   // remove from back
        int both = (index + 1) + (n - index2);   // min from front, max from back
        int both2 = (index2 + 1) + (n - index);   // same as prev...
 return Math.min(Math.min(left, right), Math.min(both, both2));
    }
}