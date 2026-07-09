class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int n =nums.length;
        int maxi =0;
        for(int j =0;j<n;j++){
            if(nums[j]==1){
            count++;
            }
            else{
              maxi=  Math.max(maxi,count);
              count=0;
            }
        }
        return Math.max(count,maxi);
    }
}