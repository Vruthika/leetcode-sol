
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=-1;
        for(int key:map.keySet()){
            if(map.get(key)==key){
                max=Math.max(max,key);
            }
        }
        System.out.println(map);
        return max;
    }
}
