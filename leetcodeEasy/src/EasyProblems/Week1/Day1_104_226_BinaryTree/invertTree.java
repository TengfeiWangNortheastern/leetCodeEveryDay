package EasyProblems.Week1.Day1_104_226_BinaryTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

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

class Solution {
    public TreeNode invertTree(TreeNode root) {
        //层序
        if(root==null)
            return null;
        TreeNode origin=root;
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        TreeNode medium=root;
        while(!queue.isEmpty()){
            root=queue.pop();
            // swap left and right child of the current node
            medium=root.left;
            root.left=root.right;
            root.right=medium;
            if (root.left!=null) queue.add(root.left);
            if (root.right!=null) queue.add(root.right);
        }
        return origin;
    }
}