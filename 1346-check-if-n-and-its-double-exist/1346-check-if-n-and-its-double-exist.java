class Solution {
    public boolean checkIfExist(int[] arr) {
        
        Arrays.sort(arr);
        int countZeros = 0;
      
        
      for(int i =0 ;i<arr.length;i++){  
           int start = 0 ;
        int end = arr.length-1;
           if(arr[i]*2 == 0){
            countZeros++;
            if(countZeros == 2){
                return true;
            }
            
        }
        while (end>=start){
            int mid = start + (end -start)/2;
            
            if(arr[mid]==arr[i]*2&&arr[i]!=0){
                return true;
            }
             if(arr[mid]>arr[i]*2){
                end = mid -1 ;
            }
            else start = mid +1;
        }}
        return false ;
        
        
    }
}