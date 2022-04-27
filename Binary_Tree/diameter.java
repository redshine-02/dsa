/**
 * Definition for a binary tree node.
*/
import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class pair{
    int h;
    int d;
    pair(){}
    pair(int h , int d){
        this.h = h;
        this.d = d;
    }
}

public class diameter {
    //Approach 1
    public int height(TreeNode root){
        if(root == null){
            return -1;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ans = Math.max(lh , rh) + 1 ;
        return ans;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
       int ld = diameterOfBinaryTree(root.left);
       int rd = diameterOfBinaryTree(root.right);
       int ans = height(root.left) + height(root.right) + 2;
       return Math.max(ans,Math.max(ld,rd));
    }
    //Approach 2
    // public pair diameter1(TreeNode node){
    //     if(node == null){
    //         return new pair(-1 , 0);
    //     }
        
    //     pair la = diameter(node.left);
    //     pair ra = diameter(node.right); 
        
    //     pair my = new pair();
    //     my.h = Math.max(la.h , ra.h) + 1;
    //     int c = la.h + ra.h + 2;
        
    //     my.d =  Math.max( c , Math.max(la.d , ra.d));
        
    //     return my;
    // }
    //  public int diameterOfBinaryTree1(TreeNode root){
    //      pair ans = diameter(root);
    //      return ans.d;
    //  }
    // }

    //Approach 3
    // public int[] diameter(TreeNode node){
    //     if(node == null){
    //         return new int[]{-1,0};
    //     }
        
    //     int[] la = diameter(node.left);
    //     int[] ra = diameter(node.right); 
        
    //     int[] my = new int[2];
    //     my[0] = Math.max(la[0] , ra[0]) + 1;
    //     int c = la[0] + ra[0] + 2;
        
    //     my[1] =  Math.max( c , Math.max(la[1] , ra[1]));
        
    //     return my;
    // }
    //  public int diameterOfBinaryTree(TreeNode root){
    //      int[] ans = diameter(root);
    //      return ans[1];
    //  }

    //Approach 4
    // static int ans = -(int)1e9;
    // public int diameterx(TreeNode node){
    //     if(node == null){
    //         return -1;
    //     }
    //     int lh = diameterx(node.left);
    //     int rh = diameterx(node.right);
        
    //     ans = Math.max( ans , lh+rh+2 );
        
    //     int myAns = Math.max(lh,rh)+1;
        
    //     return myAns;
    // }
 
    // public int diameterOfBinaryTree(TreeNode root){
    //     ans = -(int)1e9;
    //     diameterx(root);
    //     return ans;
    // }
}