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