class Solution {
    public int calculateScore(int a, int b) {
        int c1 =0;
        int c2 =0;
        int temp =a;
        while(temp!=0){
            int binary = temp%2;
            if(binary ==1) c1++;
            temp = temp/2;
        }
          int temp2 =b;
        while(temp2!=0){
            int binary = temp2%2;
            if(binary ==1) c2++;
            temp2 = temp2/2;
        }
        if(c1>=c2){
            return c1*c2;
        }
            return c2/c1;
        
    }
}