class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(count == 0) {
                candidate = nums[i];
            }

            if(candidate == nums[i]) {
                count++;
            }
            else {
                count--;
            }
        }

        return candidate;
    }
}
//Time Complexity: O(n) where n is the length of the nums array. We iterate through the array once to find the majority element.
//Space Complexity: O(1) as we are using a constant amount of extra space regardless