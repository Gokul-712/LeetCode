class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int current = arr[i];
            arr[i]=max;
            if(current>max)
            {
                max=current;
            }
        }
        return arr;
    }
}
//Time Complexity: O(n) where n is the length of the input array arr. We iterate through the array once to replace elements.
//Space Complexity: O(1) since we are modifying the input array in place and not