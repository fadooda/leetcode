/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> nodesofparents;
        nodesofparents= new Stack<TreeNode>();
        TreeNode currentnode= root;
        List<Integer> postordernodes= new ArrayList<Integer>();
        
        if(root==null)
        {
            return postordernodes;
        }
        nodesofparents.push(root);
        while (!nodesofparents.isEmpty())
        {
            currentnode = nodesofparents.pop();
            postordernodes.add(currentnode.val);
            
            if(currentnode.left!=null)
            {
                nodesofparents.push(currentnode.left);
            }
            if(currentnode.right !=null)
            {
                nodesofparents.push(currentnode.right);
            }
        }
        Collections.reverse(postordernodes);
        return postordernodes;
    }
}