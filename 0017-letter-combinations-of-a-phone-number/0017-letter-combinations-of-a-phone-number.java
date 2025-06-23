class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        List<String> res=new ArrayList<>();
        res.add("");
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        for(char d:digits.toCharArray()){
            String letter=map.get(d);
            System.out.println(letter);

            List<String> ans=new ArrayList<>();
            for(String c:res){
                for(char l:letter.toCharArray()){
                    ans.add(c+l);
                }
            }
            res=ans;
        }
        return res;
    }
}