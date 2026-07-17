class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length())
            return res;

        Map<Character, Integer> map_p = new HashMap<>();
        Map<Character, Integer> map_s = new HashMap<>();

        // build frequency map for p
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            map_p.put(ch, map_p.getOrDefault(ch, 0) + 1);
        }

        int l = 0, count = p.length();

        for (int r = 0; r < s.length(); r++) {
            char ch = s.charAt(r);
            map_s.put(ch, map_s.getOrDefault(ch, 0) + 1);

            if (map_p.containsKey(ch) && map_s.get(ch) <= map_p.get(ch)) {
                count--;
            }

            // FIX: window size check
            if (r - l + 1 > p.length()) {
                char leftch = s.charAt(l);
                if (map_p.containsKey(leftch) && map_s.get(leftch) <= map_p.get(leftch)) {
                    count++;
                }
                map_s.put(leftch, map_s.get(leftch) - 1);
                l++;
            }

            // when all chars matched
            if (count == 0) {
                res.add(l);
            }
        }
        return res;
    }
}
