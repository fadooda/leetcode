import java.util.*;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorderNodes = new ArrayList<>();
        if (root == null) return postorderNodes; // Edge case: Empty tree

        Stack<TreeNode> stack1 = new Stack<>(); // Stack for processing nodes
        Stack<TreeNode> stack2 = new Stack<>(); // Stack to store postorder sequence

        stack1.push(root); // Start with the root node

        // Step 1: Process nodes in root-right-left order and store in stack2
        while (!stack1.isEmpty()) {
            TreeNode current = stack1.pop();
            stack2.push(current); // Store the node for postorder retrieval

            // Push left and right children for processing
            if (current.left != null) stack1.push(current.left);  
            if (current.right != null) stack1.push(current.right); 
        }

        // Step 2: Retrieve nodes from stack2 in left-right-root order (postorder)
        while (!stack2.isEmpty()) {
            postorderNodes.add(stack2.pop().val);
        }

        return postorderNodes;
    }
}
