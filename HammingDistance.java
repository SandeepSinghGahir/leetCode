class Solution {
    public int hammingDistance(int x, int y) {
     return Integer.bitCount(x^y);
        
        /* Without using api to count set bits or 1s
        int xor = x^y;
        int count=0;
        while(xor>0){
            count++;
           xor = xor & (xor-1);
        }
        return count;*/
    }
}
