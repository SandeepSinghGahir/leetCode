//https://leetcode.com/problems/string-to-integer-atoi/
import java.util.*;
class Solution {
    public int myAtoi(String str) {
        StringBuilder res = new StringBuilder();
        boolean intencountered = false;
        String [] acceptedSymbol = {"+","","-"};
        List accepted = Arrays.asList(acceptedSymbol);
        for(char c: str.toCharArray()){
            if(c==' ' && !intencountered)
                continue;
            if(isDigit(c) || ((c=='-' || c == '+') && !intencountered)){
                intencountered = true;
                res.append(c);
            }
            else break;
        }
        String resultString = res.toString();
        try{
            return accepted.contains(resultString) ? 0 : Integer.parseInt(resultString) ;
        }
        catch(NumberFormatException e){
            return resultString.contains("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
    
    private boolean isDigit(char c){
        return c>='0' && c<='9';
    }
}
