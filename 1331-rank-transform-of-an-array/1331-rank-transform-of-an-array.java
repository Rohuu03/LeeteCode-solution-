class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n =arr.length;
        int []arr2 =arr.clone();
        Arrays.sort(arr2);
        HashMap<Integer,Integer> map = new HashMap<>();
//int []ranks=new int[n];
        int rank=1;
        for(int val:arr2){
            if(!map.containsKey(val)){
            map.put(val,rank++);
            }
        }
    int [] res =new int[n];
    for(int i=0;i<n;i++){
        res[i]=map.get(arr[i]);
    }
    return res;
    }
}