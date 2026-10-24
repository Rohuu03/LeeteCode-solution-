class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {

        int n = nums.length;
        long i =-1;
         long count =0;
        for(int j=0;j<n;j++){
           
            if(nums[j] < minK || nums[j] > maxK){
                i=j;
            }
          else{
              count+= j-i;
          }
        }
        return count;
    }
}