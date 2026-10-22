class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        int count[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]!=0)
            {
                return false;
            }
        }
        return true;
    }
}

//Time Complexity: O(n) where n is the length of the input strings s and t. We iterate through the strings once to count the characters.
//Space Complexity: O(1) since the size of the count array is fixed at 26, regardless of the input size.