class Solution {
    public int countGoodSubstrings(String s) {
        
        int n = s.length();

       int count =0;

        for(int i=0;i<n;i++){
             HashSet<Character> set = new HashSet<>();
            for(int j =i;j<n;j++){
                char ch = s.charAt(j);
                set.add(ch);
                if((j-i+1)== 3 ){
                    if(set.size()==3){
                    count++;
                    break;
                    }
                }
            }
        }
        return count;
    }
}