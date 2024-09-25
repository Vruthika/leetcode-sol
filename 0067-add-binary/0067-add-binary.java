import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger d1 = new BigInteger(a, 2);
        BigInteger d2 = new BigInteger(b, 2);
        BigInteger res = d1.add(d2);
        String binary = res.toString(2);
        
        return binary;

    }
}