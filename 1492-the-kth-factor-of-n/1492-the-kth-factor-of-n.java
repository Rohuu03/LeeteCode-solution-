class Solution {
    public int kthFactor(int n, int k) {
        int idx =0;
        int arr[] = new int[n];
        // if(  n==k && n <3) return n;
        for(int i=1;i<=n;i++){
            if(n%i==0 && idx <arr.length){
            arr[idx++] = i;
            }
        }
       // for(int i=0;i<arr.length;i++){
          //  System.out.print(arr[i]+" ");
         
            if(k <= idx) {
                return arr[k-1];
            }

        return -1;
    }
}