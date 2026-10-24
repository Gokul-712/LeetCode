class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++)
        {
            int age = Integer.parseInt(details[i].substring(11,13));
            if(age>60)
            {
                count++;
            }
        }
        return count;
    }
}
//Time Complexity: O(n) where n is the length of the input array details. We iterate through the array once to count seniors.
//Space Complexity: O(1) since we are using a constant amount of space for variables