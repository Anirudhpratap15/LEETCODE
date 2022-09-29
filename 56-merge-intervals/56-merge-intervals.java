class Solution {
    public int[][] merge(int[][] intervals) {
        //sorting Each sub array by oth index (starting interval)
      Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        
        // taking linkList to store and to get last interval easily 
        LinkedList<int[]> merge = new LinkedList<>();

        for (int[] interval : intervals){
            // for adding first interval merger is empty so add it 
            if (merge.isEmpty()||merge.getLast()[1]<interval[0]){
                merge.add(interval);
            }
            // if overlapping then by getLast update 
            else {
                merge.getLast()[1] = Math.max(merge.getLast()[1],interval[1]);
            }

        }
        return merge.toArray(new int[merge.size()][]);    
    }
}