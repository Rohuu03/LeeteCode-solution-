class Solution {
    public int minCostToMoveChips(int[] position) {
            int count =0 ,count2=0;
        for(int i=0;i<position.length;i++){
                if(position[i]%2==0)
                count++;
                else{
                    count2++;
                }
        }
        return Math.min(count,count2);
    }
}