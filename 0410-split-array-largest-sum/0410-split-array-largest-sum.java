class Solution {
    static boolean isvalid(int []nums,int k ,int mid){
        int n =nums.length;
        int p =1;
        int sublen =0;
        for(int i=0;i<n;i++){
            if(sublen+nums[i]<=mid)
            //store karvao
             sublen+=nums[i];
             else{
                p++;
                if(nums[i]>mid || p>k)
                return false;
                else{
                    sublen=0;
                sublen+=nums[i];
//return true;
                }                
             }   
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=nums[i];
        }
        int s=0;
        int e=sum;
        int ans=-1;
                if(n<k)
        return -1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(isvalid(nums,k,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return ans;
    }
}