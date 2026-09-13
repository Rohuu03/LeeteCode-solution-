class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;
        int[] fwd = new int[n];
        int[] bwd = new int[n];

        fwd[0] = arr[0];
        int maxSum = arr[0];
        for (int i = 1; i < n; i++) {
            fwd[i] = Math.max(arr[i], fwd[i-1] + arr[i]);
            maxSum = Math.max(maxSum, fwd[i]);
        }

        bwd[n-1] = arr[n-1];
        for (int i = n-2; i >= 0; i--) {
            bwd[i] = Math.max(arr[i], bwd[i+1] + arr[i]);
        }

        for (int i = 1; i < n-1; i++) {
            maxSum = Math.max(maxSum, fwd[i-1] + bwd[i+1]);
        }

        return maxSum;
    }
}
