
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<List<Integer>>  result = new ArrayList<List<Integer>>() ;
    public List<List<Integer>> levelOrder(TreeNode root) {
       // Base Case 
        if(root == null) 
            return result; 
          
        // Create an empty queue for level order tarversal 
        Queue<TreeNode> q =new LinkedList<TreeNode>(); 
          
        // Enqueue Root and initialize height 
        q.add(root); 
          
          
        while(true) 
        { 
            ArrayList temparray=new ArrayList<Integer>();  
            // nodeCount (queue size) indicates number of nodes 
            // at current level. 
            int nodeCount = q.size(); 
            if(nodeCount == 0) 
                break; 
              
            // Dequeue all nodes of current level and Enqueue all 
            // nodes of next level 
            while(nodeCount > 0) 
            { 
                TreeNode node = q.peek(); 
                System.out.print(node.val + " ");
                temparray.add(node.val);
                q.remove(); 
                if(node.left != null) 
                    q.add(node.left); 
                if(node.right != null) 
                    q.add(node.right); 
                nodeCount--; 
            } 
            result.add( new ArrayList<Integer>(temparray));
            System.out.println(); 
        } 
        return result;
    }


}