// traverse from the back, find where the decline point is, swap for the next greatest, then reverse, don't do the n^2 time complexity thing
// Difference in Java: in java, there is no swap function and no reverse function for arrays

class Solution {

    public void swap(int[] nums, int i, int j)
    {
        int ans = nums[i];
        nums[i] = nums[j];
        nums[j] = ans;
        return;
    }
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int end = n - 1;
        
        while(end > 0 && nums[end-1] >= nums[end])
        {
            end--;
        }
        if(end == 0)
        {
            for(int i = 0, j = n-1 ; i <= j ; i++, j--)
            {
                swap(nums, i, j);
            }
            return;
        }
        else
        {
            int smallestDiff = Integer.MAX_VALUE;
            int ans = 0;
            for(int i = end ; i < n ; i++)
            {
                if(nums[i] > nums[end-1])
                {
                    int diff = nums[i] - nums[end-1];
                    if(diff <= smallestDiff)
                    {
                        smallestDiff = diff;
                        ans = i;
                    }
                }
            }
            swap(nums, ans, (end-1));
            for(int i = end, j = n-1 ; i <= j ; i++, j--)
            {
                swap(nums, i, j);
            }
        }

    }
}
