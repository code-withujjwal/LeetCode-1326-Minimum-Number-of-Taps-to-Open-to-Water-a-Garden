class Solution {

    public int minTaps(int n, int[] ranges) {

        // jump[i] = maximum right coverage from i
        int[] jump = new int[n + 1];

        // convert taps into intervals
        for (int i = 0; i <= n; i++) {

            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);

            jump[left] = Math.max(jump[left], right);
        }

        int taps = 0;

        // current guaranteed coverage
        int currEnd = 0;

        // maximum future reach
        int farthest = 0;

        for (int i = 0; i <= n; i++) {

            // impossible case
            if (i > farthest) {
                return -1;
            }

            // update future reach
            farthest = Math.max(farthest, jump[i]);

            // current coverage exhausted
            if (i == currEnd) {

                // no need to open extra tap at end
                if (i != n) {

                    taps++;

                    // move coverage forward
                    currEnd = farthest;
                }
            }
        }

        return taps;
    }
}
