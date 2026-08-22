class Solution {
    public boolean checkDivisibility(int n) {
        int sum =0;
        int p =1;
        int temp =n;
        while(temp>0){
            int digit =temp%10;
            p *=digit;
            sum +=digit; 
            temp =temp/10; 
        }
    
         if(n%(sum+p)==0) return true;
         return false;
    }
}