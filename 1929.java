class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
//Time Complexity: O(n) where n is the length of the input array nums. We iterate through the array once to fill the new array ans.
//Space Complexity: O(n) where n is the length of the input array nums. We create a new array ans of size 2*n to store the concatenated result.