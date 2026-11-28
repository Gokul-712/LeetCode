import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                count+=map.get(nums[i]);
           }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        return count;
    }
}

// Time Complexity: O(n) where n is the length of the input array. This is because we are iterating through the array once to populate the map and count the pairs.
// Space Complexity: O(n) where n is the length of the input array. This is
