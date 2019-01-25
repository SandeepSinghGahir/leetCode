class Solution {
    public int findComplement(int num) {        
        String binary_num = Integer.toBinaryString(num);
        int sum=0,index=0;
        for(int i=binary_num.length()-1;i>=0;i--){
            if(binary_num.charAt(i)=='0')
               sum+= Math.pow(2,index);
            index++;
        }
        return sum;
    }
}
