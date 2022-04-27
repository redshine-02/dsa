import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class pair{
    int sum;
    int tilt;
    pair(){}
    pair(int sum , int tilt ){
        this.sum = sum;
        this.tilt = tilt;
    }
}
public class tilt_of_binary_tree {
    static int ans = 0;
    public pair function(TreeNode node){
        if(node == null){
            return new pair(0,0);
        }
        pair ld = function(node.left);
        pair rd = function(node.right);
        
        pair myAns = new pair();
        
        myAns.sum = ld.sum + rd.sum + node.val;
        int c = ld.sum-rd.sum;
        if(c<0){
            c*=-1;
        }
        myAns.tilt = c;
        ans += myAns.tilt;
        
        return myAns;
            
    }
    public int findTilt(TreeNode root) {
        ans = 0;
        pair ans1 = function(root);
        return ans;
    }
}