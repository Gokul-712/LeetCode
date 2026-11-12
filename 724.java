class Solution {
    public int pivotIndex(int[] nums) {
        int ts = 0;
        int ls=0;
        for(int i=0;i<nums.length;i++)
        {
            ts+=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int rs = ts-ls-nums[i];
            if(rs==ls)
            {
                return i;
            }
            ls+=nums[i];
        }
        return -1;
    }
}
//Time Complexity: O(n) where n is the length of the input array nums. This is because we are iterating through the array twice, once to calculate the total sum and once to find the pivot index.
//Space Complexity: O(1) because we are using a constant amount of extra space regardless of the input size.