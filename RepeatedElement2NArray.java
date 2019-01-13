class Solution {
    public int repeatedNTimes(int[] A) {
        List arr = new ArrayList<>();
        for(int i: A){
            if(!arr.contains(i))
                arr.add(i);
            else
                return i;
        }
        return -1;        
    }
}
