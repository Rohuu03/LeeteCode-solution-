class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> mp = new HashMap<>();
       int left =0,n=s.length();
       int maxlen =0;
       for(int i=0;i<n;i++){
        char ch = s.charAt(i);
        if(mp.containsKey(ch)){
            left =Math.max(left,mp.get(ch)+1);
        }
            mp.put(ch,i);
            maxlen=Math.max(maxlen,i-left+1);
       } 
       return maxlen;
    }
}