class Solution {
    static boolean isvalid(int[]position,int m ,int mid){
        int count =1;
        int n = position.length;
        int pos = position[0];
        for(int i=1;i<n;i++){
            if(position[i]-pos>=mid){
                pos = position[i];
                count++;
                if(count==m)
                return true;
            }
             }
            return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
      int s=0;
      int n = position.length;
      int e =position[n-1]-position[0];
     int ans =-1;
      while(s<=e){
        int mid = s+(e-s)/2;
        if(isvalid(position,m,mid)){
            ans =mid;
               s =mid+1;
        }
        else{
             e=mid-1;
        }
      } 
      return ans;
    }
}