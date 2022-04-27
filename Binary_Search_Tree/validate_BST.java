import java.util.*;
class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
 
public class validate_BST {
    long prev = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        
        boolean ld = isValidBST(root.left);
        if(ld==false){
            return ld;
        }
        
        if(prev>=root.val){
            return false;
        }
        
        prev = root.val;
        
        boolean rd = isValidBST(root.right);
        if(rd==false){
            return rd;
        }
        return true;
    }
}