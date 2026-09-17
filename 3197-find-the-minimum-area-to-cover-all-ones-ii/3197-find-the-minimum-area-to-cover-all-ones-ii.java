class Solution {
     public static int minimumSum(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int ans = Integer.MAX_VALUE;
        // case1
        for(int i=0;i<n;i++){
            for(int j=i+1;j+1<n;j++){
                ans = Math.min(ans ,res(arr,0,0,i,m-1) +
                        res(arr,i+1,0, j,m-1)+
                        res(arr,j+1,0,n-1,m-1));
            }
        }
// case 2
        for(int i=0;i<m;i++){
            for(int j=i+1;j+1<m;j++){
                ans = Math.min(ans ,res(arr,0,0,n-1,i) +
                        res(arr,0,i+1, n-1,j)+
                        res(arr,0,j+1,n-1,m-1));
            }
        }
        // case 3
        for(int i=0;i+1<n;i++){
            for(int j=0;j+1<m;j++){
                ans = Math.min(ans ,res(arr,0,0,i,j) +
                        res(arr,0,j+1, i,m-1)+
                        res(arr,i+1,0,n-1,m-1));
            }
        }
        // case 4
        for(int i=0;i+1<n;i++ ){
            for(int j=0;j+1<m;j++){
                ans = Math.min(ans ,res(arr,0,0,i,m-1) +
                                       res(arr,i+1,0, n-1,j)+
                          res(arr,i+1,j+1,n-1,m-1));
            }
        }
         // case 5
              for(int i=0;i+1<n;i++ ) {
                  for (int j = 0; j + 1 < m; j++) {
                      ans = Math.min(ans, res(arr, 0, 0, n - 1, j) +
                              res(arr, 0, j + 1, i, m - 1) +
                              res(arr, i + 1, j + 1, n - 1, m - 1));
                  }
              }
              // case 6
                  for(int i=0;i+1<n;i++ ){
                      for(int j=0;j+1<m;j++){
                          ans = Math.min(ans ,res(arr,0,0,i,j) +
                                  res(arr,i+1,0, n-1,j)+
                                  res(arr,0,j+1,n-1,m-1));
                      }
        }
        return ans;
    }
    public static int res(int[][] grid ,int cr,int cc,int er ,int ec) {
        int minrow = Integer.MAX_VALUE;
        int mincol = Integer.MAX_VALUE;
        int maxrow = Integer.MIN_VALUE;
        int maxcol = Integer.MIN_VALUE;
        for(int i=cr;i<=er;i++){
            for(int j=cc;j<=ec;j++) {
                if (grid[i][j] == 1) {
                    minrow = Math.min(minrow, i);
                    mincol = Math.min(mincol, j);
                    maxrow = Math.max(maxrow, i);
                    maxcol = Math.max(maxcol, j);
                }
            }
        }
        int len = maxrow-minrow+1;
        int b =maxcol-mincol+1;
        return len*b;
    }
}