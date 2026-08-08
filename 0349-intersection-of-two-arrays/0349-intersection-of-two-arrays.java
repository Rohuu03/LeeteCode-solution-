class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int arr[] = new int[Math.min(nums1.length,nums2.length)];
        int index=0;
       int i=0,j=0;
            while(i<nums1.length && j <nums2.length){
                if(nums1[i]==nums2[j]){
                    if(index==0 || arr[index-1]!=nums1[i]){
                    arr[index++]=nums1[i];
                }
                i++;
                j++;
                }
                else if(nums1[i]>nums2[j]){
                    j++;
                }
                else{
                    i++;
                }
                }
            int res[] = new int [index];
            for(int k =0;k<index;k++){
                 res[k]= arr[k];
            }
        return res;
    }
}
