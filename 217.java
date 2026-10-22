import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(); 
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;

    }
}
//Time Complexity: O(n) where n is the length of the input array nums. We iterate through the array once to check for duplicates.
//Space Complexity: O(n) where n is the length of the input array nums. We create a HashSet to store unique elements.