class Solution {
    public int maxProduct(int n) {
       int arr[] = new int [10];
       int index=0;
        while(n>0){
            int digit = n%10;
            arr[index++]=digit;
            n/=10;
        }
        int maxp =-1;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                maxp = Math.max(maxp ,arr[i]*arr[j]);
            }
        }
      return maxp;
    }
}