class Solution {
    public int minOperations(int[] nums, int k) {
        int index =0;
        //int arr[] = new int[nums.length]; 

        for(int i=0;i<nums.length;i++){
                if(nums[i]<k){
                    index++;
                // arr[index++] =nums[i];
                //  }
         }
        }
        // int max =0;
        // for(int i=0;i<index;i++){
        //  max =   Math.max(arr[i],max);
        // }
        return index;
    }
}