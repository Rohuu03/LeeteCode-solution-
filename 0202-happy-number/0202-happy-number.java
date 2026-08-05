class Solution {
    public boolean isHappy(int n) {
        boolean flag = false;
        if(n==1 || n ==7){
            return true;
        }
        else if(n<10){
            return false;
        }
        else{
             int res =0;
             while(n>0){
            int digit = n%10;
            res +=digit*digit;
            n=n/10;
         }
       return isHappy(res);
        }
    }
}