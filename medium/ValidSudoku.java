import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        return checkRows(board) && checkCols(board) && checkBoxes(board);       
      /*  
        00 to 22
        03 to 25
        06 to 28
            
        30 to 52
        33 to 55
        36 to 58
            
        60 to 82
        63 to 85
        66 to 88
         
        63 64 65
        73 74 75
        83 84 85
            
*/
            
    }
    
        private boolean checkBoxes(char[][] board){     
            int[] c1 = {0,3,6};
            int[] c2 = {2,5,8};
            
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(!checkinRange(board,c1[i],c1[j],c2[i],c2[j]))
                        return false;
                        
                }
            }
            return true;
        }
    
        private boolean checkinRange(char[][] board, int rs,int cs, int re,int ce){
            HashSet<Character> set = new HashSet<>();
            for(int i=rs;i<=re;i++){
                for(int j=cs;j<=ce;j++){
                    if(board[i][j]!='.' && set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }        
            }
            return true;
        }
    
        private boolean checkRows(char[][] board){
            HashSet<Character> set = new HashSet<>();  
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(board[i][j]!='.' && set.contains(board[i][j]))
                        return false;
                    set.add(board[i][j]);
                }
            set.clear();
            }
            return true;
        }
    
        private boolean checkCols(char[][] board){
            HashSet<Character> set = new HashSet<>();  
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    if(board[j][i]!='.' && set.contains(board[j][i]))
                        return false;
                    set.add(board[j][i]);
                }
            set.clear();
            }
            return true;
        }

}
