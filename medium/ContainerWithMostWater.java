//https://leetcode.com/problems/container-with-most-water/
class Solution {
    public int maxArea(int[] height) {
        int res = 0;        
        /* Brute force 0(n^2)
        for(int i=0; i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                res = Math.max(res,Math.min(height[i],height[j])*(j-i));
            }
        }*/
        //Optimized 0(n)
        int head=0;
        int tail=height.length-1;
        while(head<tail){
            res = Math.max(res,(Math.min(height[head],height[tail])*(tail-head)));
            
            if(height[head] > height[tail])
                tail--;
            else if(height[head] < height[tail])
                head++;
            else{
                tail--;
                head++;
            }
        }
        return res;
    }
}
