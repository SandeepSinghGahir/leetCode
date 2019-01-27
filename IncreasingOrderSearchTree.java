class Solution {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> resultNodes = new ArrayList<Integer>();
        resultNodes = buildRightTree(root,resultNodes);
        TreeNode res = new TreeNode(0);
        TreeNode ptr = res;
        for(int i : resultNodes){
            res.right = new TreeNode(i);
            res = res.right;
        }            
        return ptr.right;
    }
    
    private List<Integer> buildRightTree(TreeNode root, List<Integer> resultNodes){
        if(root==null)
            return resultNodes;
        buildRightTree(root.left,resultNodes);        
        resultNodes.add(root.val);
        buildRightTree(root.right,resultNodes);
        return resultNodes;
    }
}
