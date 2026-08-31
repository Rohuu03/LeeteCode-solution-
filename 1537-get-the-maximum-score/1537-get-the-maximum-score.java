class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        long sum1=0 ,sum2 =0;
        int i =0,j=0;
        long ans =0;
         int MOD = 1_000_000_007;
        while(i<n && j <m){
            if(nums1[i]<nums2[j]){
                sum1 += nums1[i];
                i++;
            }
            else if(nums1[i]>nums2[j]){
                sum2 += nums2[j];
                j++;
            }
            else{
                ans += Math.max(sum1,sum2)+nums1[i];
                sum1 =0;
                sum2 =0;
                i++;
                j++;
            }
        }
        while(i<n){
            sum1 +=nums1[i];
            i++;
        }
        while(j<m){
            sum2 +=nums2[j];
            j++; 
          }
          ans += Math.max(sum1,sum2);
          ans %= MOD;

        return (int) ans;
    }
}