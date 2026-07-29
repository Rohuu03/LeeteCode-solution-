class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int num = nums1[i];
            int max =-1;
            int index=-1;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==num){
                    index=j;
                    break;
                }
            }
            for(int j=index;j<nums2.length;j++){
                if(nums2[j]>num){
                    max =nums2[j];
                    break;
                }
            }
            arr[i]=max;
        }
        return arr;
    }
}