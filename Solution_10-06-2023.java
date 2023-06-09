import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> find_permutation(String S) {
        List<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        int n = chars.length;

        Arrays.sort(chars);

        boolean[] used = new boolean[n];
        StringBuilder sb = new StringBuilder();

        backtrack(chars, used, sb, result);

        return result;
    }

    private void backtrack(char[] chars, boolean[] used, StringBuilder sb, List<String> result) {
        int n = chars.length;

        if (sb.length() == n) {
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < n; i++) {
            if (used[i]) continue;

            if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            sb.append(chars[i]);

            backtrack(chars, used, sb, result);

            used[i] = false;
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String S = "ABC";
        List<String> permutations = solution.find_permutation(S);

        for (String permutation : permutations) {
            System.out.print(permutation + " ");
        }
    }
}