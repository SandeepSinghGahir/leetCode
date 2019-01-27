class Solution {
    private String keyboard_1 = "qwertyuiop";
    private String keyboard_2 = "asdfghjkl";
    private String keyboard_3 = "zxcvbnm";
    
    public String[] findWords(String[] words) {
     List<String> result = new ArrayList<String>();
        int count=0;
        for(String word: words){
            if(isWordInOneKeyboardline(word.toLowerCase()))
                result.add(word);
        }
        return result.toArray(new String[result.size()]);
    }
    
    private boolean isWordInOneKeyboardline(String word){
        int line_1=0,line_2=0,line_3=0;        
        for(char ch : word.toCharArray()){
        String c = Character.toString(ch);
        if(keyboard_1.contains(c))
            line_1=1;
        else if(keyboard_2.contains(c))
            line_2=1;
        else if(keyboard_3.contains(c))
            line_3=1;
        }
        return line_1+line_2+line_3==1 ? true : false;
    }
}
