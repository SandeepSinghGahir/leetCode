class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int index = 0;
        for(int i=0;i<A.length-1;i++){
            if( A[i] < A[i+1])
                index=i+1;
        }
    return index;        
    }
}
