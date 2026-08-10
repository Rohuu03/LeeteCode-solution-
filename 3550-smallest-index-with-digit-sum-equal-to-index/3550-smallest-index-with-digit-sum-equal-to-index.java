class Solution {
    public int smallestIndex(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(nums[i]>0){
                arr[i]+=nums[i]%10;
                nums[i]/=10;
            }
            if(arr[i]==i)
            return i;
        }
        return -1;
    }
}