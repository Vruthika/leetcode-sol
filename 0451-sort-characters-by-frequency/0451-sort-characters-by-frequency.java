class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());
        StringBuilder res=new StringBuilder();
        for(Map.Entry<Character,Integer> e:list)
        {
            char k=e.getKey();
            int v=e.getValue();
            for(int i=0;i<v;i++)
            {
                res.append(k);
            }
        }
        return res.toString();
    }
}