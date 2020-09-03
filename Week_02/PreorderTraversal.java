import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author zhaocenliu
 * @create 2020/9/3 11:19 上午
 * 二叉树前序遍历
 */

public class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root != null) {
            stack.push(root);
            while (!stack.isEmpty()) {
                root = stack.pop();
                res.add(root.val);
                if (root.right != null) {
                    stack.push(root.right);
                }
                if (root.left != null) {
                    stack.push(root.left);
                }
            }
        }
        return res;
    }
}
