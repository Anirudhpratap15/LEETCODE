class Solution {
    public int splitArray(int[] nums, int m) {
         int start = 0;
        int end = 0;


        for (int num : nums) {
            start = Math.max(start, num);
            end += num;
        }

        while (end > start) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int piece = 1;
            for (int num : nums) {

                if (sum + num > mid) {
                    sum = num;
                    piece++;
                } else {
                    sum += num;
                }
            }
            if (piece > m) {
                start = mid + 1;
            } else end = mid;
        }

        return start;
        
    }
}