class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max =-1;
        int ans =0;
       for(int i=0;i<arr.length;i++){
         if(max<arr[i]){
            max = arr[i];
            ans = i;
         }
       }
       return ans;
    }
}