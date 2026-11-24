class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ascending = true;
        boolean descending = true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                descending = false;
            }
            else if(nums[i]<nums[i+1])
            {
                ascending = false;
            }
        }
        return ascending || descending;
    }
}
// Time Complexity: O(n) where n is the length of the input nums array. This is because we are iterating through the array once to check if it is monotonic.
// Space Complexity: O(1) because we are not using any additional data structures that scale