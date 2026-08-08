class Solution {
    public int minimumFlips(int n) {
        String binary = Integer.toBinaryString(n);
       // StringBuilder sb = new StringBuilder(binary);
        String rev =new StringBuilder(binary).reverse().toString();
            int count =0;
        for(int i=0;i<binary.length();i++){
                 char ch1 = binary.charAt(i);
                if(rev.charAt(i)!=ch1) count++;
        }
        return count;
    }
}