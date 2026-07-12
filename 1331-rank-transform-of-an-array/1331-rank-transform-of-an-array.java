class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];
        int []arr2 = new int[n];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i];
        }
        int index=0;
        Arrays.sort(arr2);
        int []ranks = new int[n];
        ranks[0]=1;
       for(int i=1;i<n;i++){
            if(arr2[i]==arr2[i-1]){
                ranks[i]=ranks[i-1];
            }
            else{
                ranks[i]=ranks[i-1]+1;
            }
       }
       int []res = new int[n];
       for(int i=0;i<n;i++){
        int pos =Arrays.binarySearch(arr2,arr[i]);
        res[i]=ranks[pos];
       }
        return res;
    }
}