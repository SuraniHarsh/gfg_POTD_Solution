import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int arr[][] = new int[1000][1000];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().findK(arr, n, m, k));
            t--;
        }
    }
}

class Solution {
    int findK(int[][] A, int n, int m, int k) {
        int kth = 0;
        int istart = 0, iend = n - 1, jstart = 0, jend = m - 1;

        while (istart <= iend && jstart <= jend) {
            for (int j = jstart; j <= jend; ++j) {
                ++kth;
                if (k == kth)
                    return A[istart][j];
            }
            ++istart;

            for (int i = istart; i <= iend; ++i) {
                ++kth;
                if (k == kth)
                    return A[i][jend];
            }
            --jend;

            for (int j = jend; j >= jstart; --j) {
                ++kth;
                if (k == kth)
                    return A[iend][j];
            }
            --iend;

            for (int i = iend; i >= istart; --i) {
                ++kth;
                if (k == kth)
                    return A[i][jstart];
            }
            ++jstart;
        }

        return -1; // Return -1 if kth element is not found
    }
}
