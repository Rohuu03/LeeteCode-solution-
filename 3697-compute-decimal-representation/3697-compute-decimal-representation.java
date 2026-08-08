class Solution {
    public int[] decimalRepresentation(int n) {
      // sabse phele digit count kar le 
      if (n == 0) return new int[]{0};
      int temp = n ;
      int count =0;
       while (temp > 0) {
            if (temp % 10 != 0) {
                count++;
            }
            temp /= 10;
        }
      //ab array banake sotre kara lo
      int arr[] = new int[count];
      int index =count-1;
      int place =1;
      while(n>0){
        int digit = n%10;
        if(digit!=0)
        arr[index--] = digit*place;
        n = n/10;
        place *=10;
      }
        return arr;
    }
}