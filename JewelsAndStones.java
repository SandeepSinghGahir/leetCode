class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        //Since it is given that all the jewels are distinct we can use HashSet to store them.
        Set<Character> jewels = new HashSet<Character>();
        for(char c : J.toCharArray())
            jewels.add(c);        
        //Checking if stone is jewel or not.
        for(char c : S.toCharArray()){
            if(jewels.contains(c))
                count++;
        }
        return count;
    }
}
