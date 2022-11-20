class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
               ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        //storing value in list x
        for (int n : nums1) {
            x.add(n);
        }

        //if element of nums2 is present in nums1 then add in list y   that is our ans 
        for (int n : nums2) {
            if (x.contains(n)) {
                y.add(n);
                //to remove duplicated remove previous value which is checked already 
                x.remove(Integer.valueOf(n));
            }

        }
        //converting list to arrray 
        int[] ans  = new int [y.size()];
int i = 0 ;
        for (int n : y) {
ans[i++] = n ;

        }
        return ans ;
        
    }
}