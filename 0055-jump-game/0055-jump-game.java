class Solution {
    static boolean solve(int []nums,int i ,int max){
        if(max>=nums.length-1)
        return true;
        if(i>max)
        return false;
        max = Math.max(max,i+nums[i]);
      return  solve(nums,i+1,max);
        
    }
    public boolean canJump(int[] nums) {
        int max =0;
        int i=0;
        return  solve(nums,i,max);
    }
}