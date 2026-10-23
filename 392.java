class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int count =0;
        for(int j=0;j<t.length() && i<s.length();j++)
        {
            if(s.charAt(i)==t.charAt(j))
            {
                i++;
                count++;
            }
        }
        return s.length()==count;
    }
}

//Time Complexity: O(n) where n is the length of the input string t. We iterate through the string t once to check for subsequence.
//Space Complexity: O(1) since we are using a constant amount of space for variables