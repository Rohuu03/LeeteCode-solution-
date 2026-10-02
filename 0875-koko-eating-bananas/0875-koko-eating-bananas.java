class Solution {
    public static boolean canEat(int piles[],int h , int mid){
        long hr =0;
      
        for(int i=0;i<piles.length;i++){
       
            hr += (mid+piles[i]-1)/mid;

            if(hr > h) return false;
        }
        return hr<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int max =piles[0];

        for(int i=0;i<piles.length;i++){
            if(  piles[i] > max )
            max = piles[i];
        }
        int i =1;
        int j =max;
        int ans =max;

        while(i<=j){
            int mid = i + (j-i)/2;

            if(canEat(piles,h,mid)){
                ans = mid;
                j = mid-1; // min ke liye jana h 
            }
            else{
                i =mid+1;
            }
        }
        return ans;
    }
}