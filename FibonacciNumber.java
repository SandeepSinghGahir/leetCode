class Solution {
    public int fib(int N) {
        if(N<=1)
            return N;
        int i=1,prev=0,next=0,sum=0;
        for(int j=0;j<N-1;j++){
            next = prev + i;
            sum=+next;
            prev = i;           
            i=next;            
        }
        return sum;
        
        /*Using Recursion*/            
        //return N<2 ? N : fib(N-1)+fib(N-2);            
    }
}
