class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; // Edge case: Empty tree

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Number of nodes in current level
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // Remove the front element
                level.add(node.val);

                if (node.left != null) queue.add(node.left); // Add left child
                if (node.right != null) queue.add(node.right); // Add right child
            }
            result.add(level);
        }
        return result;
    }
}
