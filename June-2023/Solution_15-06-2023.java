//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        int n = S.length();
        int start = 0;
        int maxLength = 0;

        for (int center = 0; center < n; center++) {
            // Odd-length palindrome
            int left = center;
            int right = center;
            while (left >= 0 && right < n && S.charAt(left) == S.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }

            // Even-length palindrome
            left = center;
            right = center + 1;
            while (left >= 0 && right < n && S.charAt(left) == S.charAt(right)) {
                if (right - left + 1 > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }
        }

        return S.substring(start, start + maxLength);
    }
}