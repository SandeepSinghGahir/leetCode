class Solution {
    public int compress(char[] chars) {
    int len = chars.length;    
    int index = 0,i=0;
        
        while(i<len){
           int count = 0; 
            char c = chars[i];            
            while( i<len && chars[i]==c){                
                i++;
                count++;
            }
            chars[index++]=c;
            if(count>1){       
                char[] digs = Integer.toString(count).toCharArray();
                for(char dig : digs)
                    chars[index++]=dig;
            }            
        }
        return index;
    }
}
