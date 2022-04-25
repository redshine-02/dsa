/** */
 //* Definition for a binary tree node.
import java.util.*;

public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
 
public class LCA {
    public ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data){
    if(node == null){
          return new ArrayList<TreeNode>();
      }
      
      if(node.val == data){
          ArrayList<TreeNode> base = new ArrayList<>();
          base.add(node);
          return base;
      }
      
      ArrayList<TreeNode> lh = nodeToRootPath(node.left , data);
      if(lh.size()>0){
          lh.add(node);
          return lh;
      }
      ArrayList<TreeNode>  rh = nodeToRootPath(node.right , data);
      if(rh.size()>0){
          rh.add(node);
          return rh;
      }
      
      return new ArrayList<TreeNode>();
  }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        ArrayList<TreeNode> pl = nodeToRootPath(root , p.val);
        ArrayList<TreeNode> ql = nodeToRootPath(root , q.val);
        
        TreeNode LCA = null;
        for(int i = pl.size()-1 , j = ql.size()-1 ; i>=0 && j>=0 ; i-- , j--){
            if(pl.get(i).val!=ql.get(j).val){
                break;
            }   
            LCA = pl.get(i);
        }
        
        return LCA;
    }
}