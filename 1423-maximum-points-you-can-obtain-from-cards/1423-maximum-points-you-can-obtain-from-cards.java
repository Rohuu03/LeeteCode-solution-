class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sumpf =0;
        int sumsf =0;
        int n =cardPoints.length;
        int max =0;
        for(int i=0;i<k;i++){
            sumpf +=cardPoints[i];
        }
         max=sumpf;
         for(int i=0;i<k;i++){
            sumpf =sumpf-cardPoints[k-1-i];
            sumsf+=cardPoints[n-1-i];
            max = Math.max(max,(sumpf +sumsf));
         }
        return max;
    }
}