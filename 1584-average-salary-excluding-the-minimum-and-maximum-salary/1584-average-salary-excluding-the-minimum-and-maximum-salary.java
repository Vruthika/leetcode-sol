class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double tot=0;
        for(int i=1;i<salary.length-1;i++)
        {
            tot+=salary[i];
        }
        return tot/(salary.length-2);
    }
}