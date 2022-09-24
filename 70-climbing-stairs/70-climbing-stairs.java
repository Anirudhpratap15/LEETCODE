class Solution {
    public int climbStairs(int n) {
        //take new array to store the ans to the corresponding nth value 
        int[] dp = new int[46];
        
        dp[0]= 0 ;
        dp[1]= 1 ;
        //there is two ways to climbing a staircase of 2  eg 1+1 ans only 2 
         dp[2]= 2 ;
        
        for(int i = 3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n] ;
        
    }
}