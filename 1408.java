class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words.length;j++)
            {
                if(i!=j && words[j].contains(words[i]))
                {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }
}

//Time Complexity: O(n^2 * m) where n is the number of words and m is the average length of the words. In the worst case, we may have to compare each word with every other word, and checking if one string contains another takes O(m) time.
//Space Complexity: O(k) where k is the number of words that are found to be substrings of other words. In the worst case, all words could be substrings of other words, leading to a space complexity of O(n).