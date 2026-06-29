class Solution {
    public int maxProduct(int[] nums) {
        int pf =1;
        int sf =1;
        int maxp =Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0;i<n;i++){
            if(pf==0) 
            pf =1;
            if(sf==0)
            sf=1;
            pf *=nums[i];
            sf *=nums[n-1-i];
          maxp =  Math.max(maxp ,Math.max(pf,sf));
        }
        return maxp;
    }
}