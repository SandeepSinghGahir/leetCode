class Solution {
    public int[][] kClosest(int[][] points, int K) {
        int[][]closest = new int[K][2];
        Arrays.sort(points,new Comparator<int[]>(){
           @Override
            public int compare(int[] p1,int[] p2){
                return ((p1[0]*p1[0] + p1[1]*p1[1])- (p2[0]*p2[0]+p2[1]*p2[1]));
            }
        });
        
        for(int i=0;i<K;i++)
            closest[i] = points[i];        
    return closest;
    }
}
