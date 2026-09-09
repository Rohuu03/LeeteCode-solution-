class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int freq[] = new int[26];
     int freq2[] = new int[26];
     if(n!=t.length()) return false;
        for(int i=0;i<n;i++){
            char ch =s.charAt(i);
            char ch2 =t.charAt(i);
            freq[ch-'a']++;
            freq2[ch2-'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }
}