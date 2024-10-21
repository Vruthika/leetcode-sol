class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int idx = 0;
        while (i < chars.length) {
            char curr = chars[i];
            int ct = 0;
            while (i < chars.length && chars[i] == curr) {
                ct += 1;
                i++;
            }
            chars[idx++] = curr;
            if (ct > 1) {
                char[] countChars = String.valueOf(ct).toCharArray();
                for (int j = 0; j < countChars.length; j++) {
                    chars[idx++] = countChars[j];
                }
            }
        }
        return idx;
    }
}
