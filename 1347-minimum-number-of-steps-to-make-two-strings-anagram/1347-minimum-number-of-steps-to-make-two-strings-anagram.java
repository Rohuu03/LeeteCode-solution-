class Solution {
    public int minSteps(String s, String t) {
        int freq[] = new int[26];
        int freq2[] = new int[26];
int n = s.length(), m=t.length();
        for(int i=0;i<n;i++){
            int idx = s.charAt(i)-'a';
            freq[idx]++;
        }
          for(int i=0;i<m;i++){
            int idx = t.charAt(i)-'a';
            freq2[idx]++;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(freq2[i]<freq[i]){
                count +=Math.abs(freq2[i]-freq[i]);
            }
        }
        return count;
    }
}