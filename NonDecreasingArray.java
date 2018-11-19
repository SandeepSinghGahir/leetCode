class Solution {
    public boolean checkPossibility(int[] nums) {
    		int cnt = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (cnt==1) {
                    return false;
                } else {
                    ++cnt;
                    if (i-2>=0 && nums[i-2] > nums[i]) {
                    /**Update only when number before the current index is greater than next number since it eliminates the possibility that changing the current number may make non-decreasing array 
                         3,  -> 3 <- , 2, 2 
                         3      >      2, means changing 3 at index 1 will never make non-decreasing array
                        -1,  -> 4 <- , 2, 3
                        -1      <      2, means changing 4 ar index 1 may make non-decreasing array
                    **/
                        nums[i] = nums[i-1];
                    }
                }
            }
        }
        return true;
    }
}
