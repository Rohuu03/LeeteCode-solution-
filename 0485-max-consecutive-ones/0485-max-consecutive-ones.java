class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int max =0;
        int sum =0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==0) sum =0;
          sum +=nums[j];
          
          max =Math.max(max,sum);
        }
        return max;
    }
}