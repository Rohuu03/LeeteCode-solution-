class Solution {
    public int xorOperation(int n, int start) {
        int index=0;
        int []arr = new int [n];
        for(int i=0;i<n;i++){
            arr[index++]=start+2*i;
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            res ^=arr[i];
        }
        return res;
    }
}