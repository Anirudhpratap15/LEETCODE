class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1;
        int j = 0;
        for(int i =m;i<=k;i++){
            nums1[i]=nums2[j++];
        }
        
   Arrays.sort(nums1);
        
    }
}