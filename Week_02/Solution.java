import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/**
 * @Author zhaocenliu
 * @create 2020/9/3 3:26 下午
 */
public class Solution {
    public List< Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new LinkedList<Integer>();
        Stack < TreeNode > stack = new Stack <TreeNode> ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}

