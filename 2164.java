import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {

        Integer odd[] = new Integer[nums.length / 2];
        int even[] = new int[(nums.length + 1) / 2];

        int j = 0, k = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                even[j++] = nums[i];
            }
            else {
                odd[k++] = nums[i];
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd, Collections.reverseOrder());

        int p = 0, g = 0;

        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                nums[i] = even[g++];
            }
            else {
                nums[i] = odd[p++];
            }
        }

        return nums;
    }
}

//Time Complexity: O(nlogn) where n is the length of the input array nums. This is because we are sorting the even and odd indexed elements separately, which takes O(nlogn) time.
//Space Complexity: O(n) where n is the length of the input array nums. This is because we are using two additional arrays to store the even and odd indexed elements separately.