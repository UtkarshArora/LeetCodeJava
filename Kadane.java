class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            sum = sum + nums[i];
            maxSum = Math.max(sum, maxSum);
            sum = Math.max(sum, 0);
        }
        return maxSum;
    }
}
