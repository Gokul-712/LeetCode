import java.util.*;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Find next greater elements in nums2
        for(int i = 0; i < nums2.length; i++)
        {
            while(!stack.isEmpty() && nums2[i] > stack.peek())
            {
                map.put(stack.pop(), nums2[i]);
            }

            stack.push(nums2[i]);
        }

        // Remaining elements have no greater element
        while(!stack.isEmpty())
        {
            map.put(stack.pop(), -1);
        }

        // Get answers for nums1
        int arr[] = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++)
        {
            arr[i] = map.get(nums1[i]);
        }

        return arr;
    }
}