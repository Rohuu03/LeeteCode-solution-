class Solution {
    public String maxSumOfSquares(int num, int sum) {
        // If sum is too large or too small, no solution
        if (sum > 9 * num || sum < 0) return "";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, sum); // take max possible digit
            sb.append(digit);
            sum -= digit;
        }

        return sb.toString();
    }
}
