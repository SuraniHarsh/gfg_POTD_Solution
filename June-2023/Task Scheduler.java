class Solution {
static int leastInterval(int N, int K, char[] tasks) {
        int[] taskFreq = new int[26];
        int maxFreq = 0;
        int maxFreqCount = 0;

        for (char task : tasks) {
            taskFreq[task - 'A']++;
            if (taskFreq[task - 'A'] > maxFreq) {
                maxFreq = taskFreq[task - 'A'];
                maxFreqCount = 1;
            } else if (taskFreq[task - 'A'] == maxFreq) {
                maxFreqCount++;
            }
        }

        int intervals = (maxFreq - 1) * (K + 1) + maxFreqCount;
        return Math.max(intervals, N);
    }
}