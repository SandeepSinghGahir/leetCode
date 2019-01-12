class Solution {
    public int uniqueMorseRepresentations(String[] words) {        
    String [] dict = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
      Set morseCodes = new HashSet<>();
    for(String word : words){
        StringBuilder morse = new StringBuilder("");        
        for(char c : word.toCharArray())
            morse.append(dict[c-'a']);    
        morseCodes.add(morse.toString());        
        }        
    return morseCodes.size();    
    }    
}
