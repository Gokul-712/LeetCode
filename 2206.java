import java.util.HashMap;
class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        if(nums.length%2!=0)
        {
            return false;
        }
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int values : map.values())
        {
            if(values%2!=0)
            {
                return false;
            }
        }
        return true;
    }
}

// Time Complexity: O(n) where n is the length of the input nums array. This is because we are iterating through the array once to populate the map and then iterating through the map values to check if they are even.
// Space Complexity: O(n) where n is the length of the input nums array. This is because we are using a map to store the frequency of each number in the array, which can contain up to n elements.