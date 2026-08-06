class Solution {
    public double largestTriangleArea(int[][] points) {
        double area  =0.0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                for(int k =j+1;k<points.length;k++){
                int  x1 = points[i][0];
                int  x2 = points[j][0];
                int x3 = points[k][0];
                int  y1 = points[i][1];
                int y2 = points[j][1];
                int y3 = points[k][1];
                area  = Math.max( area,Math.abs( 0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))));
            }
            }
        }
        return area;
    }
}