class Solution {
    public String reverseString(String s) {
    StringBuilder res = new StringBuilder();
    char [] res_c = s.toCharArray();        
    for(int i=s.length()-1;i>=0;i--)
        res.append(res_c[i]);
         //res.append(s.charAt(i));    
    return res.toString();
    }
}
