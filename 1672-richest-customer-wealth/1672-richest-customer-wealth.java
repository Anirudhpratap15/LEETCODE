class Solution {
    public int maximumWealth(int[][] accounts) {
          int max = 0;

        for (int[] account : accounts) {
            int totalWealth = 0;
            for (int i : account) {
                totalWealth = i + totalWealth;
            }
            if (totalWealth > max) {
                max = totalWealth;
            }
        }
        return max;
    }
    

}