class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max =0;
        for(int i=0;i<n;i++){
             int[] count = new int[26];
            for(int j =i;j<n;j++){
                 int ch = s.charAt(j) - 'a';
                count[ch]++;
                if (count[ch] > 2) {
                    break;
                }
                 max = Math.max(max ,j-i+1);
            }
           
        }
        return max;
    }
}