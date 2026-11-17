import java.util.*;
class Solution {
    public int heightChecker(int[] heights) {
        int expected[] = heights.clone();
        Arrays.sort(expected);
        int count=0;
        for(int i=0;i<heights.length;i++)
        {
            if(heights[i]!=expected[i])
            {
                count++;
            }
        }
        return count;
    }
}

// Time Complexity: O(n log n) where n is the length of the input heights array. This is because we are sorting the expected array, which takes O(n log n) time.
// Space Complexity: O(n) where n is the length of the input heights array. This is because we are creating a new array expected to store the sorted values of heights.