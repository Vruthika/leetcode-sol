class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vowels=new HashMap<>();
        HashMap<Character,Integer> conso=new HashMap<>();
        char[] l=s.toCharArray();
        for(int i=0;i<l.length;i++){
            if(l[i]=='a' || l[i]=='e' || l[i]=='i' || l[i]=='o' || l[i]=='u'){
                vowels.put(l[i],vowels.getOrDefault(l[i],0)+1);
            }
            else{
                conso.put(l[i],conso.getOrDefault(l[i],0)+1);
            }
        }
        Integer vo = vowels.isEmpty() ? 0 : Collections.max(vowels.values());
        Integer co = conso.isEmpty() ? 0 :Collections.max(conso.values());
        return (int)vo+co;
    }
}