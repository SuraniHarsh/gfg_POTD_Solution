//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.Rearrange(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    public void Rearrange(int[] arr, int n) {
        int negIdx = 0; // Index to track the position of the next negative number

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != negIdx) {
                    // Shift all elements between negIdx and i to the right by one position
                    int temp = arr[i];
                    for (int j = i; j > negIdx; j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[negIdx] = temp;
                }
                negIdx++;
            }
        }
    }
}