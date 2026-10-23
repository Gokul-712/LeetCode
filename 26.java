class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}
//Time Complexity: O(n) where n is the length of the input array nums. We iterate through the array once to remove duplicates.
//Space Complexity: O(1) since we are modifying the input array in place and not