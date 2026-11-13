import java.util.*;
class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashSet<String> set = new HashSet<>();
        HashSet<String> dup = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!set.contains(arr[i]))
            {
                if(!dup.contains(arr[i]))
                {
                    set.add(arr[i]);
                }
            }
            else
            {
                set.remove(arr[i]);
                {
                    dup.add(arr[i]);
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(arr[i]))
            {
                k--;
            if(k==0)
            {
                return arr[i];
            }
            }
        }
        return "";
    }
}
// Time Complexity: O(n) where n is the length of the input array arr. This is because we are iterating through the array twice, once to populate the sets and once to find the kth distinct string.
// Space Complexity: O(n) where n is the length of the input array arr. This is because we are using two additional sets to store the distinct and duplicate strings separately.