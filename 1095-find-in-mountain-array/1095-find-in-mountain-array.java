/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int peak = getPeak(mountainArr);
        int ans = agnosticBinarySearch(mountainArr,target,0,peak,true);
        if(ans== -1){
           ans = agnosticBinarySearch(mountainArr,target,peak, mountainArr.length()-1,false);   
        }
        return ans ;
    }
    
    int getPeak(MountainArray mountainArr){
        int start = 0 ;
        int end = mountainArr.length()-1;
        while(end>=start){
            int mid = start + (end-start)/2;
            
            
            if(mountainArr.get(mid+1)>mountainArr.get(mid)){
                start = mid+1;
            }
            else if(mountainArr.get(mid-1)>mountainArr.get(mid)){
                end= mid -1;
            }
            else return mid ;
        }
        return -1 ;
    }
    
     int agnosticBinarySearch(MountainArray mountainArr,int target ,int start , int end,boolean asc){
        asc  = mountainArr.get(start)<mountainArr.get(end);
       
           
           while(end>=start){
            int mid = start + (end-start)/2;
           
     if(asc) {
         
            if(target > mountainArr.get(mid)){
                start = mid+1;
            }
            else if(target<mountainArr.get(mid)){
                end= mid -1;
            }
            else return mid ;
         }
        else{ if(target < mountainArr.get(mid)){
                start = mid+1;
            }
            else if(target > mountainArr.get(mid)){
                end= mid -1;
            }
            else return mid ;}       
        }
        return -1 ;
    }
    
    
}