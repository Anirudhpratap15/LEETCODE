class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans = new ArrayList<>();
        int[] x= candies.clone();
         Arrays.sort(candies);
        int max = candies[candies.length-1];
        
        for(int i =0 ;i<candies.length;i++){
            if(x[i] + extraCandies >=max){
                ans.add(true);
            }
            else  ans.add(false) ;
        }
        return ans ;
        
    }
}