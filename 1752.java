class Solution {
    public boolean check(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[(i+1) % nums.length])
            {
                count+=1;
            }
        }
        return count<=1;
    }
}
// Time Complexity: O(n) where n is the length of the input nums array. This is because we are iterating through the array once to check if it is sorted in a circular manner.
// Space Complexity: O(1) because we are not using any additional data structures that scale with the input size. We are only using a constant amount of space for variables.