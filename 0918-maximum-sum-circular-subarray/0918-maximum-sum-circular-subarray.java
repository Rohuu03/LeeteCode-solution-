class Solution {
    public static int kadanes(int nums[]){
        int n=nums.length;
        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum +=nums[i];
            max = Math.max(sum , max);
            if(sum < 0){
                sum =0;
            }
        }
        return max;
    }
    public int maxSubarraySumCircular(int[] nums) {
        
        int n = nums.length;
        int linear_sum =0;
        int total =0;

           linear_sum = kadanes(nums);

        for(int i=0;i<n;i++){
            total +=nums[i];
            nums[i] = -nums[i];
        }
        int neg_sum = 0;
        neg_sum = kadanes(nums);
        int c_sum = neg_sum + total;
        if(linear_sum <0) return linear_sum;
        int maxi = Math.max(c_sum , linear_sum);
        return maxi;
    }
}