class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i=left;i<=right;i++){            
            //Add if the number is self dividing
            if(isSelfDividing(i))
                numbers.add(i);
        }
        return numbers;
    }
            
    private boolean isSelfDividing(int i){
       int j=i;
        while(j>0){  
                if(j%10==0  || (i%(j%10)) != 0)
                    return false;                
                j = j/10;
            } 
        return true;
    }
}
