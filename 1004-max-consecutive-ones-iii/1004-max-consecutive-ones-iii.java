class Solution {
    public int longestOnes(int[] nums, int k) {
        int n =nums.length;
        int countzero =0;
        int i =0;
        int len =0;
        for(int j=0;j<n;j++){
            if(nums[j]==0)
                countzero++;
        while(countzero>k){
            if(nums[i]==0){
                countzero--;
            }
            i++;
        }
        len = Math.max(len,j-i+1);
        }
        return len;
    }
}