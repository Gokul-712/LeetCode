import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid){
        HashSet<Integer> set = new HashSet<>();
        int result[]=new int[2];
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(set.contains(grid[i][j]))
                {
                    result[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                }
            }
        }
        for(int i=1;i<=Math.pow(grid.length,2);i++)
        {
            if(!(set.contains(i)))
            {
                result[1]=i;
            }
        }
        return result;
    }
}
// Time Complexity: O(n^2) where n is the length of the input grid. This is because we are iterating through the grid twice, once to populate the set and once to find the missing value.
// Space Complexity: O(n^2) where n is the length of the input grid. This is because we are using a set to store the values in the grid, which can contain up to n^2 elements.