class Solution {
     public static boolean canReach(int []dist , int mid, double hour ){
        int n = dist.length;
        double count =0.00;
            for(int i=0;i<n;i++){
                if(i== n-1){ // at last fractions are allowed
                    count += (double)dist[i]/mid; 
                }
                else{
                 count +=(dist[i]+mid-1)/mid;
                }
                if(count > hour) return false;
            }
            return count <=hour;
     }
    public int minSpeedOnTime(int[] dist, double hour) {
        int n = dist.length;
      //  int max =Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     max = Math.max(dist[i], max);
        // }
        int i=1;
         int j  =10000000;
         int ans =-1;
        while(i<=j){
            int mid = i +(j-i)/2;
            if(canReach( dist ,mid ,hour)){
                ans =mid;
                j =mid-1;
            }
            else{
                i =mid+1;
            }
        }
        return ans;
    }
}