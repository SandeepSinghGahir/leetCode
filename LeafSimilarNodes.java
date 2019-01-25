class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    
        List<Integer> root1_leaves = new ArrayList<Integer>();
        List<Integer> root2_leaves = new ArrayList<Integer>();
        root1_leaves = getLeafNodes(root1,root1_leaves);
        root2_leaves = getLeafNodes(root2,root2_leaves);
        return root1_leaves.equals(root2_leaves);
    }
    
    private List<Integer> getLeafNodes(TreeNode root,List<Integer> root_leaves){
    if(root==null)
        return root_leaves;
    if(root.left==null && root.right==null)
        root_leaves.add(root.val);
    getLeafNodes(root.left,root_leaves);
    getLeafNodes(root.right,root_leaves);
    return root_leaves; 
    }
    
}
