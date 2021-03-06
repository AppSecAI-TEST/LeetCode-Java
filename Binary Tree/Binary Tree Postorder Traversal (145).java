/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        while (root != null || !stack.empty()) {
            if (root != null) {
                result.add(0, root.val);
                stack.add(root.left);
                root = root.right;
            } else {
                root = stack.pop();
            }
        }
        
        return result;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        
        while (root != null || !stack.empty()) {
            if (root != null) {
                stack.add(root);
                root = root.left;
            } else if (stack.peek().right != null && stack.peek().right != pre) {
                root = stack.peek().right;
            } else {
                TreeNode peek = stack.pop();
                result.add(peek.val);
                pre = peek;
                root = null;
            }
        }
        
        return result;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        
        return result;
    }
    
    private void postorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.val);
    }
}
