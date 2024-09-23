class Solution {
    private static Map<Integer,String> map;
    static{
        map=new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(4,"Four");
        map.put(5,"Five");
        map.put(6,"Six");
        map.put(7,"Seven");
        map.put(8,"Eight");
        map.put(9,"Nine");
        map.put(10,"Ten");
        map.put(11,"Eleven");
        map.put(12,"Twelve");
        map.put(13,"Thirteen");
        map.put(14,"Fourteen");
        map.put(15,"Fifteen");
        map.put(16,"Sixteen");
        map.put(17,"Seventeen");
        map.put(18,"Eighteen");
        map.put(19,"Nineteen");
        map.put(20,"Twenty");
        map.put(30,"Thirty");
        map.put(40,"Forty");
        map.put(50,"Fifty");
        map.put(60,"Sixty");
        map.put(70,"Seventy");
        map.put(80,"Eighty");
        map.put(90,"Ninety");
        map.put(100,"Hundred");
        map.put(1000,"Thousand");
        map.put(1_000_000,"Million");
        map.put(1_000_000_000,"Billion");
    }
    public String numberToWords(int num) {
        if(num==0)
            return "Zero";
        return convert(num).trim();
    }
    private String convert(int num) {
    if (num < 20) {
        return map.get(num) + " ";
    }
    if (num < 100) {
        return map.get(num / 10 * 10) + (num % 10 != 0 ? " " + convert(num % 10) : " ");
    }
    if (num < 1000) {
        return map.get(num / 100) + " " + map.get(100) + (num % 100 != 0 ? " " + convert(num % 100) : " ");
    }
    if (num < 1_000_000) {
        return convert(num / 1000) + map.get(1000) + (num % 1000 != 0 ? " " + convert(num % 1000) : " ");
    }
    if (num < 1_000_000_000) {
        return convert(num / 1_000_000) + map.get(1_000_000) + (num % 1_000_000 != 0 ? " " + convert(num % 1_000_000) : " ");
    }
    return convert(num / 1_000_000_000) + map.get(1_000_000_000) + (num % 1_000_000_000 != 0 ? " " + convert(num % 1_000_000_000) : "");
}
}