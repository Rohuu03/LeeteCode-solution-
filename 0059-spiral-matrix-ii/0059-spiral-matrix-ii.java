class Solution {
    public int[][] generateMatrix(int n) {

        int[][] arr = new int[n][n];

        int minrow = 0;
        int maxrow = n - 1;
        int mincol = 0;
        int maxcol = n - 1;

        int c = 1;
        int total = n * n;

        while (c <= total) {

            // Left to Right
            for (int i = mincol; i <= maxcol && c <= total; i++) {
                arr[minrow][i] = c;
                c++;
            }
            minrow++;

            // Top to Bottom
            for (int i = minrow; i <= maxrow && c <= total; i++) {
                arr[i][maxcol] = c;
                c++;
            }
            maxcol--;

            // Right to Left
            for (int i = maxcol; i >= mincol && c <= total; i--) {
                arr[maxrow][i] = c;
                c++;
            }
            maxrow--;

            // Bottom to Top
            for (int i = maxrow; i >= minrow && c <= total; i--) {
                arr[i][mincol] = c;
                c++;
            }
            mincol++;
        }

        return arr;
    }
}