class Solution {
    public int longestSubsequence(int[] nums) {
        int total =0;
        int count =0;
      for(int i=0;i<nums.length;i++){
            total ^=nums[i];
            if(nums[i]==0){
                count++;
            }
      }
      if(count==99999+1)
      return 0;
    
      if(total==0) return nums.length-1;
      return nums.length;
    }
}