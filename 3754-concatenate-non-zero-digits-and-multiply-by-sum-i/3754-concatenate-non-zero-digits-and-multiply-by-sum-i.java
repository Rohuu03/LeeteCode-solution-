class Solution {
    public long sumAndMultiply(int n) {
        long temp1=0;
        while(n>0){
            long digit = n%10;
            if(digit!=0){
                temp1 = temp1*10+digit;
            }
            n/=10;
        }
        long sum =0;
    long reverse =0;
    while(temp1>0){
        long digits =temp1%10;
        sum+=digits;
        reverse = reverse*10+digits;
        temp1 =temp1/10;
    }    
    return sum*reverse;
    }
}