class Solution {
    public int thirdMax(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int arr[] = new int[n];
        int index =0;
        arr[index++] = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) continue;
             arr[index++] = nums[i];
        }
                if (index < 3) {
            return arr[index - 1];
        }

        return arr[index - 3];

    }
}