class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       int ans = 0;
        // traversing stones if char is present in jewels String increment the ans 
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                ans += 1;
            }

        }
        return ans;
}}