class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        long ans = Long.MAX_VALUE;
        Collections.sort(a);
        for(int i = 0 ; i< n-m+1;i++){
            int j = i+m-1;
            
            if(a.get(j) - a.get(i) < ans){
                ans = a.get(j) - a.get(i);
            }
        } return ans ;
    }
}
