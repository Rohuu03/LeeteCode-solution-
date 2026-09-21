import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n];
        
        // Compute factorials and initialize available numbers list
        int fact = 1;
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            fact *= i;
            factorial[i] = fact;
            numbers.add(i);
        }
        numbers.add(n);
        
        // Convert k to 0-based index
        k--;
        
        StringBuilder result = new StringBuilder();
        
        // Build the permutation digit by digit
        for (int i = n; i > 0; i--) {
            int blockFactorial = factorial[i - 1];
            int index = k / blockFactorial;
            
            result.append(numbers.get(index));
            numbers.remove(index);
            
            k %= blockFactorial;
        }
        
        return result.toString();
    }
}