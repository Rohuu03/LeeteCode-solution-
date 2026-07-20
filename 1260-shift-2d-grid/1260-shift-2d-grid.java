class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
      // List<List<Integer>> res = new ArrayList<>();
            int m =grid.length;
            int n =grid[0].length;
            int total =m*n,index =0;
            int arr[]= new int[total]; 
            for(int i=0;i<m;i++){
                for(int j =0;j<n;j++){
                    arr[index++]=grid[i][j];
                }
            }
            int rotate[] = new int [total];
            for(int i=0;i<arr.length;i++){
                rotate[(i+k)%total]=arr[i];
            }
            List<List<Integer>> res = new ArrayList<>();
            index =0;
            for(int i=0;i<m;i++){
                List<Integer> row = new ArrayList<>();
                for(int j=0;j<n;j++){
                    row.add(rotate[index++]);
                }
                res.add(row);
            }
            return res;
    }
}