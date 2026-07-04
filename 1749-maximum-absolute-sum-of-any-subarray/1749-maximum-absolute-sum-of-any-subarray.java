class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max =Integer.MIN_VALUE;
        int smax =0;
        int min =Integer.MAX_VALUE;
        int smin=0;
        for(int i =0;i<n;i++){
            smax+=nums[i];
            max =Math.max(max,smax);
            if(smax<0)
            smax =0;

            smin+=nums[i];
            min =Math.min(min,smin);
            if(smin>0)
            smin=0;
        } 
    int ans =Math.max(-min,max);
    return ans;
    }
}