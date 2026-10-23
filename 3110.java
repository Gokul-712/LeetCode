class Solution {
    public int scoreOfString(String s) {
        int score =0;
        for(int i=1;i<s.length();i++)
        {
            score+=Math.abs((int)s.charAt(i)-(int)s.charAt(i-1));
        }
    return score;
    }
}
//Time Complexity: O(n) where n is the length of the input string s. We iterate through the string once to calculate the score.