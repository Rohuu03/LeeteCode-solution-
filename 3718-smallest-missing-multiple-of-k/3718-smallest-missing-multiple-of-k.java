class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set  = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        } 
          for(int i = k; ; i = i + k) {
            if(!set.contains(i)) {
                return i;
            }
          }
       // return 0;
    }
}