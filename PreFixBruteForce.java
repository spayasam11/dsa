// Brute Force Approach
class PreFixBruteForce {
    public int getRangeSum(int[] nums, int i, int j) {
        // Simple iteration from index i to j
        int sum = 0;
        for(int k = i; k <= j; k++) {
            sum += nums[k];
        }
        return sum;
    }
}
