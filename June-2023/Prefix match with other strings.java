class Solution
{
     public int klengthpref(String[] arr, int n, int k, String str) {
        if (k > str.length())
            return 0;

        String toSearch = str.substring(0, k);
        int count = 0;

        for (int i = 0; i < n; ++i) {
            if (arr[i].length() >= k && arr[i].substring(0, k).equals(toSearch))
                ++count;
        }

        return count;
    }
}