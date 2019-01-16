    class Solution {
        public int[] sortArrayByParityII(int[] A) {

        //Using input Array only
        int ec=0,oc=1;
        int temp=-1;
            while(ec<A.length && oc<A.length){
            if(A[ec]%2==0){
                if(A[oc]%2==1){
                oc+=2;
                ec+=2;
                }else {
                    ec+=2;}
            }else{
                if(A[oc]%2==1)
                oc+=2;
                else{
                    temp=A[oc];
                    A[oc]=A[ec];
                    A[ec]=temp;}            
            }                
        }
        return A;

        //Using extra space
        /*int ec=0,oc=1;
          int res [] = new int [A.length];
            for(int i=0;i<A.length;i++){
                if(A[i]%2==0){
                    res[ec]=A[i];
                    ec+=2;
                }
                else{
                    res[oc]=A[i];
                    oc+=2;
                }
            }
            return res;*/
        }
    }
