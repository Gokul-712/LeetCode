import java.util.*;
class Solution{
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if(nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
// Time Complexity: O(n) where n is the length of the input array nums. This is because we are iterating through the array twice, once to mark the indices and once to find the disappeared numbers.
// Space Complexity: O(1) because we are not using any additional data structures that scale with the input size. We are modifying the input array in place to mark the indices.