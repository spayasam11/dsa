lass TwoSum {
    // Brute Force Approach
    public int[] findTwoSumBruteForce(int[] nums, int target) {
        // Check all possible pairs
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // No solution found
    }
    // Time Complexity: O(n²)
    // Space Complexity: O(1)

    // Efficient Approach using Two Pointers
    public int[] findTwoSumEfficient(int[] nums, int target) {
        // Initialize two pointers
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right) {
            int currentSum = nums[left] + nums[right];
            
            if(currentSum == target) {
                return new int[]{left, right};
            }
            // If sum is less than target, move left pointer to increase sum
            else if(currentSum < target) {
                left++;
            }
            // If sum is more than target, move right pointer to decrease sum
            else {
                right--;
            }
        }
        return new int[]{}; // No solution found
    }
    // Time Complexity: O(n)
    // Space Complexity: O(1)
}
