class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s1 = new StringBuilder(a);
        StringBuilder s2 = new StringBuilder(b);
        StringBuilder res = new StringBuilder();

        int carry = 0;

        s1.reverse();
        s2.reverse();
        int len = Math.max(a.length(), b.length());

        while (s1.length() < len) {
            s1.append("0");
        }
        while (s2.length() < len) {
            s2.append("0");
        }

        for (int i = 0; i < len; i++) {
            int bit1 = s1.charAt(i) - '0';
            int bit2 = s2.charAt(i) - '0';

            int currentSum = bit1 + bit2 + carry;
            res.append(currentSum % 2);
            carry = currentSum / 2;

        }
        if (carry == 1) {
            res.append("1");
        }
        return res.reverse().toString();
    }
}