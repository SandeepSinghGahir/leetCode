class Solution {
    public int[] sortArrayByParity(int[] A) {
        int [] result = new int[A.length];
        int head=0;
        int tail=A.length-1;
        for(int i : A){
          if(i%2==0)
            result[head++] = i;                        
          else
            result[tail--] = i;
      }
    return result;
    }
}
