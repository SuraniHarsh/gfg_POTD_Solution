//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxIndexDiff(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[], int n) {
        int maxDiff = 0;
        int[] maxJ = new int[n];
        
        for (int i = 0; i < n; i++){
            maxJ[i] = i;
        }
        
        for (int i= 1; i < n; i++){
            for (int j = i - 1; j >= 0; j--){
                if (arr[j] <= arr[i]){
                    maxJ[i] = j;
                }
                if (maxJ[j] == j){
                    if(arr[j] > arr[i])
                        break;
                }
                else if (arr[maxJ[j]] <= arr[i])
                    j = maxJ[j] + 1;
            }
            maxDiff = Math.max(maxDiff, i - maxJ[i]);
        }
        return maxDiff;
        
    }
}