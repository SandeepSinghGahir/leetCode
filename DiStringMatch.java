class Solution {
    public int[] diStringMatch(String S) {
        char[] str = S.toCharArray();
        int [] res = new int[S.length()+1];        
        int len = str.length;
        int x = len;
        int y = 0;
        
        for(int i=0;i<len;i++){            
            if(str[i]!='I')              
                res[i] = x--;                
            else
                res[i] = y++;            
        }
        res[len] = str[len-1]=='D' ? y : x;
        return res;
    }
}
