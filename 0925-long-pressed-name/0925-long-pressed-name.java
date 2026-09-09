class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0;// ye name wale ke liye
        int j =0; // ye typed wale ke liye
     int n = name.length(), m = typed.length();
        while(j<m){
            if(i<n && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>0 && typed.charAt(j) == typed.charAt(j - 1)){
                j++;//long pressed
            }
            else{
                return false;
            }
        }
        return i==n;
    }
}