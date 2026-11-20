import java.util.*;
class Solution {

    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = -1;
        for(int key : map.keySet())
        {
            if(key == map.get(key))
            {
                max = Math.max(max, key);
            }
        }
        return max;
    }
}
//time Complexity: O(n) where n is the length of the input array. This is because we are iterating through the array twice, once to populate the map and once to find the lucky number.
//space Complexity: O(n) where n is the length of the input array. This is because we are using a map to store the frequency of each number in the array, which can contain up to n elements.