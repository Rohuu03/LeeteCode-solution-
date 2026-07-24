class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();
        int m = magazine.length();
        if(n>m) return false;
        int freq[] = new int[26];
        for(int i=0;i<n;i++){
            char ch = ransomNote.charAt(i);
            freq[ch-'a']++;
        }
        int freq2[] = new int[26];
        for(int i=0;i<m;i++){
            char ch = magazine.charAt(i);
            freq2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>freq2[i]){
                return false;
            }
        }
        return true;
    }
}