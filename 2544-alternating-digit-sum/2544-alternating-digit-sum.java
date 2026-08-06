class Solution {
    public int alternateDigitSum(int n) {
        int sum =0;
        int index=0;
       while(n!=0){
        int digit = n%10;
     if(index%2==0)
         sum -=digit;
            else{
                sum = sum +digit;
            }
             index++;
        n = n/10;
       } 
       if (index % 2 == 1) {
            sum = -sum;
        }
       return sum;
    }
}