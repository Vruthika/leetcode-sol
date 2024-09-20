class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        Arrays.sort(s1);
        System.out.println(s1);
        char s2[]=t.toCharArray();
        Arrays.sort(s2);
        System.out.println(s2);
        return Arrays.equals(s1,s2);
    }
}