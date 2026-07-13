class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int l=0;
        int r=n-1;
       int leftmax =height[l];
       int rightmax =height[r];
       int totalwater=0;
        while(l<r){
       if(leftmax<rightmax){
        l++;
        leftmax =Math.max(leftmax,height[l]);
        totalwater+=leftmax-height[l];
       }
     else{
        r--;
        rightmax =Math.max(rightmax,height[r]);
        totalwater +=rightmax-height[r];
       } 
    }
    return totalwater;
}
}