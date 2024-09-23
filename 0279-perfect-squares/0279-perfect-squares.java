class Solution {
    public int numSquares(int n) {
        int m = (int) Math.sqrt(n);
        int[] f = new int[n + 1];
        Arrays.fill(f, Integer.MAX_VALUE);
        f[0] = 0;

        for (int i = 1; i <= m; ++i) {
            int square = i * i;
            for (int j = square; j <= n; ++j) {
                f[j] = Math.min(f[j], f[j - square] + 1);
            }
        }
        return f[n];
    }
}
