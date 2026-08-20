class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[] =new int[nums.length];
        int arr2[] =new int[nums.length];
        arr1[0] = nums[0];
        arr2[0] =nums[1];
        int index =1;
        int index2 =1;
        for(int i=2;i <nums.length;i++){
            if(arr1[index-1]>arr2[index2-1]){
                  arr1[index++] =nums[i];   
            }
            else {
                    arr2[index2++]=nums[i];
            }

        }
        int res[] = new int[nums.length];
            for(int i=0;i<index;i++){
                res[i] = arr1[i];  
             }
               for(int i=0;i<index2;i++){
                res[i+index] = arr2[i];  
             }
             return res;
    }
}