class Solution {
    static boolean isvalid(int []weights,int days,int mid){
        int n = weights.length;
        int s =1;
        int slen =0;
        for(int i=0;i<n;i++){
            if(slen+weights[i]<=mid){
                slen+=weights[i];
            }
            else{
                s++;
                if(weights[i]>mid||days<s)
                return false;
                else{
                    slen=0;
                    slen+=weights[i];
                }
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        int n = weights.length;
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=weights[i];
        }
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(isvalid(weights,days,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return  ans;
    }
}