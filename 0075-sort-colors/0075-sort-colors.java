class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int mid=0;
        int n = nums.length;
        int h =n-1;

        while(mid<=h){
            if(nums[mid]==0){
                nums[mid]=nums[l];
                nums[l]=0;
                l++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[h];
                nums[h]=2;
                h--;
            }
        }
    }
}