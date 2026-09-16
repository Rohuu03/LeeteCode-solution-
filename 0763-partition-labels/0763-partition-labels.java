class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int n = s.length();
        int freq[] = new int[26];
        
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a'] = i;
        }

        int st =0;
        int e =0;

        for(int i=0;i<n;i++){
            e = Math.max(e, freq[s.charAt(i)-'a']);
            if(i == e){
                list.add(e-st+1);
                st =i+1;
            }
        }
        return list;
    }
}