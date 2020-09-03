import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @Author zhaocenliu
 * @create 2020/9/3 11:16 上午
 * 二叉树中序遍历，采用栈的方法，如果遍历到节点没有就出栈一个
 */
public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> res = new LinkedList<Integer>();
        TreeNode cur = root;
        //注意while的用法
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}