class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum =0;
        int max =Integer.MIN_VALUE;
        int sum2 =0;
        int min = Integer.MAX_VALUE;
        int total=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            total+=nums[i];
            max= Math.max(sum,max);
            if(sum<0)
            sum=0;
            sum2 +=nums[i];
            min=Math.min(min,sum2);
            if(sum2>0) sum2=0;
        }
        if(max<0) return max;
        return Math.max(total-min,max);
    }
}