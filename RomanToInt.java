class Solution {
    public int romanToInt(String s) {
        int sum=0;
        HashMap<Character,Integer> nums = new HashMap<Character,Integer>();
        nums.put('I',1);
        nums.put('V',5);
        nums.put('X',10);
        nums.put('L',50);
        nums.put('C',100);
        nums.put('D',500);
        nums.put('M',1000);
        int l = s.length();
        for(int i=0;i<l-1;i++){ 
            if(nums.get(s.charAt(i))>=nums.get(s.charAt(i+1)))
                sum+=nums.get(s.charAt(i));
            else
                sum-=nums.get(s.charAt(i));               
        }
        return sum+=nums.get(s.charAt(l-1));       
    }
}
