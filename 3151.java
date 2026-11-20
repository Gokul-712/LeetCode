class Solution {
    public boolean isArraySpecial(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] % 2 == nums[i+1] % 2)
            {
                return false;
            }
        }
        return true;
    }
}
// Time Complexity: O(n) where n is the length of the input nums array. This is because we are iterating through the array once to check if it is special.
// Space Complexity: O(1) because we are not using any additional data structures that scale with the input size. We are only using a constant amount of space for variables.