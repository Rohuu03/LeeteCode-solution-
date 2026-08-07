class Solution {
    public int digitFrequencyScore(int n) {
         String s = String.valueOf(n);
        int[] arr = new int[s.length()];
         int idx =0;
        while(n!=0){
            int digit =n%10;
            arr[idx++] =digit;
            n/=10;
        }
        int ans =0;
         for(int i=0;i<idx;i++){
           ans +=arr[i];
         }
        return ans;

    }
}