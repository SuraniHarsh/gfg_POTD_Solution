class Solution {
    public boolean findTriplets(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    return true; 
                } else if (sum < 0) {
                    l++; 
                } else {
                    r--;
                }
            }
        }
        return false; 
    }
}