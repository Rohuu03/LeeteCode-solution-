class Solution {
    public boolean validDigit(int n, int x) {
        boolean flag = false;
       int temp = n;
        while (temp >= 10) {
            temp = temp/10;
        }
        if (temp== x) {
            return false; 
        } 
        while(n!=0){
            int digit =n%10;
            n=n/10;
            if(digit==x)
            return true;
        }
        return false;
    }
}