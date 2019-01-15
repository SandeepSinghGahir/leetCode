class Solution {
    public boolean judgeCircle(String moves) {
     int L=0,R=0,U=0,D=0;
        for(char c : moves.toCharArray()){
            switch(c)
            {
                case 'U':
                    U++;
                    break;
                case 'D':
                    D++;
                    break;
                case 'L':
                    L++;
                    break;
                case 'R':
                    R++;
                    break;
            }   
        }
    if(L==R && U==D)
        return true;
    return false;       
    }
}
