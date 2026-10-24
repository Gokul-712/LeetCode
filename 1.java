import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int diff = target - nums[i];

            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
//Time Complexity: O(n) where n is the length of the input array nums. We iterate through the array once to find the two numbers that add up to the target.
//Space Complexity: O(n) since we are using a HashMap to store the numbers and