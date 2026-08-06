class Solution {
    public int smallestNumber(int n, int t) {
        while( pod(n)%t!=0){
        n++;
       }
       return n ;
    }
        private int pod (int n ){
        int p =1;
       while(n!=0){
         p *= n%10;
        n = n/10;
       }
       return p;
        }   
}