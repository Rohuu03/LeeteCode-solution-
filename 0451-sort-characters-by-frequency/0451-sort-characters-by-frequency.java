class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
    int n = s.length();
        // Count frequency
        for (int i=0;i<n;i++) {
            char x =s.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        String ans = "";

while (!map.isEmpty()) {
    char maxChar = 0;
    int maxFreq = 0;

    for (char ch : map.keySet()) {
        if (map.get(ch) > maxFreq) {
            maxFreq = map.get(ch);// freq store hui
            maxChar = ch;//chrqcter store hua
        }
    }

    // Add character according to its frequency
    for (int j = 0; j < maxFreq; j++) {
        ans += maxChar;
    }

    map.remove(maxChar);
}

return ans;
    }
}