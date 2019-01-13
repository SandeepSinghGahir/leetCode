class Solution {
    public int[][] flipAndInvertImage(int[][] A) {    
        int[][] result = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
           int ptr=0;
            for(int j=A[0].length-1;j>=0;j--){
               if(A[i][j]==0)
                   result[i][ptr]=1;
                else
                    result[i][ptr]=0;
                ptr++;
            }
        }
        return result;                
    }
}
