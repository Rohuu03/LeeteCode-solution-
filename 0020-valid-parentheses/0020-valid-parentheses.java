class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        for( char ch : s.toCharArray()){

            if(ch =='(' || ch =='[' ||  ch =='{' )
                stack.push(ch); //agar mil jaye to dal do 
            
            else { // agar n mile to false reuturn kar de
                if(stack.isEmpty()) return false;
            
            char top = stack.pop();
            if(ch == ')' && top != '(' ) return false;
             if(ch == ']' && top != '[' ) return false;
             if(ch == '}' && top != '{' ) return false;
             
             }
        }
        return stack.isEmpty();
    }
}