class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
               ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for (int n : nums1) {
            x.add(n);
        }

        for (int n : nums2) {
            if (x.contains(n)) {
                y.add(n);
                x.remove(Integer.valueOf(n));
            }

        }
        int[] ans  = new int [y.size()];
int i = 0 ;
        for (int n : y) {
ans[i++] = n ;

        }
        return ans ;
        
    }
}