class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      // for array 1 
        int i = m -1 ;
        // for array 2
        int j = n-1 ; 
        // for array 1 with m+n length to fill the array 
        int k = m+n-1 ;
        
       
        // starting from end for both of the array will compare bigger number and put in k th place 
               while(i>=0 && j>=0){
            
            if(nums1[i]>nums2[j]){
                nums1[k--] = nums1[i--];
            }
            else nums1[k--] = nums2[j--];
        }
        
         // if j  reaches 0 first and i have some values remaining
         while (i >= 0) nums1[k--] = nums1[i--];     
        // if i  reaches 0 first and J have some values remaining
        while (j >= 0) nums1[k--] = nums2[j--];
        
    }
}