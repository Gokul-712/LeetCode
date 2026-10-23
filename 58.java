class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]=s.trim().split(" ");
        int n = arr.length;
        return arr[n-1].length();
    }
}
//Time Complexity: O(n) where n is the length of the input string s. We iterate through the string once to split it into words.
//Space Complexity: O(n) since we are creating an array of words from the input string