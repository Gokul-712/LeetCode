class Solution {
    public int maxAscendingSum(int[] nums) {
        int max =nums[0];
        int sum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
                if(sum>max)
                {
                    max=sum;
                }
            }
            else
            {
                sum=nums[i];
            }
        }
        return max;
    }
}
//Time Complexity: O(n) where n is the length of the input array nums. This is because we are iterating through the array once to find the maximum ascending sum.
//Space Complexity: O(1) because we are using a constant amount of extra space regardless