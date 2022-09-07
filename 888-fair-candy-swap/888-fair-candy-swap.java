class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
       int sa = 0, sb = 0; 
        for (int x: aliceSizes) 
            sa += x;
        for (int x: bobSizes) 
            sb += x;
        int delta = (sb-sa)/2;
        Set<Integer> setB = new HashSet<>();
        for (int x: bobSizes) 
            setB.add(x);
        for (int x: aliceSizes)
            if (setB.contains(x + delta))
                return new int[]{x, x + delta};
        return new int[]{-1,-1};
        
        
        
    }
}