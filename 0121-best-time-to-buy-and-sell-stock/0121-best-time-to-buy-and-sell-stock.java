class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max =0;
        int n = prices.length;
        for(int i=0;i<n;i++){
        //    if(prices[i]<min)
            //      min = prices[i];
             //   else if(prices[i]-min>max){
             //       max = prices[i]-min;
             min = Math.min(prices[i],min);
             max  = Math.max(prices[i]-min,max);
               // }
         }
        return max;
    }
}