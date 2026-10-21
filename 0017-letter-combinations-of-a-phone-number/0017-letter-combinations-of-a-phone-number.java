
class Solution {
    static String[] keys = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        Key_Piad(digits, "", list);
        return list;
    }

    public static void Key_Piad(String ques, String string, List<String> list) {
        if (ques.isEmpty()) {
            list.add(string);
            return;
        }

        char ch = ques.charAt(0);
        String s = keys[ch-'0'];
        for (int i = 0; i < s.length(); i++) {
            Key_Piad(ques.substring(1), string + s.charAt(i), list);
        }
    }
}