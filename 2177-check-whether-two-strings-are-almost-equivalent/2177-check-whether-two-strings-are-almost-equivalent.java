class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        for(char c:word1.toCharArray())
        {
            m1.put(c,m1.getOrDefault(c,0)+1);
        }
        for(char c:word2.toCharArray())
        {
            m2.put(c,m2.getOrDefault(c,0)+1);
        }
        for (char c : m1.keySet()) {
            int freq1 = m1.get(c);
            int freq2 = m2.getOrDefault(c, 0);

            if (Math.abs(freq1 - freq2) > 3) {
                return false;
            }
        }
        for (char c : m2.keySet()) {
            int freq1 = m2.get(c);
            int freq2 = m1.getOrDefault(c, 0);

            if (Math.abs(freq1 - freq2) > 3) {
                return false;
            }
        }
        return true;
    }
}