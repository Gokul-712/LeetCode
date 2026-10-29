import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<emails.length;i++)
        {
            String local = emails[i].substring(0, emails[i].indexOf('@'));
            String domain = emails[i].substring(emails[i].indexOf('@'),emails[i].length());
            local = local.replace(".","");
            if(local.contains("+"))
            {
                local = local.substring(0, local.indexOf('+'));
            }
            local = local.concat(domain);
            set.add(local);
        }
        return set.size();
        
    }
}
//Time Complexity: O(n * m) where n is the number of emails and m is the average length of the emails. We iterate through each email and perform string operations that take linear time with respect to the length of the email.
//Space Complexity: O(n) where n is the number of unique emails. In the worst

