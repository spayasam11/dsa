// Time Complexity: O(n) for each query
// Space Complexity: O(1)

// Efficient Approach using Prefix Sum
class PrefixEfficientSolution {
    private int[] prefixSum;
    
    // Constructor to preprocess the array
    public Solution(int[] nums) {
        prefixSum = new int[nums.length];
        // Calculate prefix sum array
        prefixSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i-1] + nums[i];
        }
    }
    
    // Method to get sum between indices i and j
    public int getRangeSum(int i, int j) {
        // If starting from 0, just return prefixSum[j]
        if(i == 0) return prefixSum[j];
        // Otherwise subtract prefixSum[i-1] from prefixSum[j]
        return prefixSum[j] - prefixSum[i-1];
    }
}
// Time Complexity: O(n) for preprocessing, O(1) for each query
// Space Complexity: O(n) for storing prefix sum array
