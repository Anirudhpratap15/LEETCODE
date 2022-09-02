class Solution {
    public int findKthPositive(int[] arr, int k) {
      int start = 0;
        int end = arr.length-1;
       while (end >=start ){
                int mid = start +(end - start)/2 ;

                if (arr[mid]-(mid+1)>=k){
                    end = mid-1;
                }
                else start = mid+1 ;


            }
        if(end == -1 ) return k;
        return arr[end] + (k-(arr[end]-(end+1)));
}
}