class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length;
        int sum =0;
        int sum2 =0;
       for(int i=0;i<n;i++){
        sum+=nums[i];
       } 
       for(int i=0;i<n;i++){
        int num= nums[i];
        while(num>0){
        sum2+=num%10;
        num =num/10;
       } 
       }
        return Math.abs(sum2-sum);
    }
}