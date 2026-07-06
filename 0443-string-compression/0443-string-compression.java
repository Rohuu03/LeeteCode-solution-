class Solution {
    public int compress(char[] chars) {
        int index =0;
        int writeindex=0;
        while(index<chars.length){
            char currentchar =chars[index];
            int count=0;
            while( index<chars.length && currentchar==chars[index]){
                index++;
                count++;
            }
            chars[writeindex]=currentchar;
            writeindex++;
            if(count>1){
                String countstr =String.valueOf(count);
            for(char digit : countstr.toCharArray()){
                chars[writeindex++]=digit;
                
            }
        }
        }
       return writeindex;
    }
}