import java.util.Arrays;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int res[] = new int[n];
        if (k == 0)
        {
            Arrays.fill(res, 0);
            return res;
        }   
        int v = 0, j = 0;
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                v = 0;
                for (j = 1; j <= k; j++) {
                    v += code[(i + j) % n];
                }
                res[i] = v;
            }
        }
        if (k < 0) {
            for (int i = 0 ; i <  n ; i++) {
                v = 0;
                for (j = 1; j <= -k; j++) {
                    v += code[(i + n - j) % n];
                }
                res[i] = v;
            }
        }
        return res;
    }
}
