class Solution {
    static boolean caneat(int[] piles, int h ,int mid){
        int counth=0;
         int n =piles.length;
        for(int i=0;i<n;i++){
           counth +=(piles[i]+mid-1)/mid;
            if(counth>h) return false;
        }
        return counth<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s =1;
        int n =piles.length;
        int max =piles[0];
        for(int i=0;i<n;i++){
            if(max<piles[i]){
                max =piles[i];
            }
        }
        int e =max;
        int k =max;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(caneat(piles,h,mid)){
                k = mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return k;
    }
}