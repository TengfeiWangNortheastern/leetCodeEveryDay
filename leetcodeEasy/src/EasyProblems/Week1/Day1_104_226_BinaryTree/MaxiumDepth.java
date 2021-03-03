package EasyProblems.Week1.Day1_104_226_BinaryTree;

import org.junit.Test;

public class MaxiumDepth {
    @Test
        public int maxDepth(TreeNode root) {
            if(root==null)
                return 0;
            else{
                int left=maxDepth(root.left); //向左递归，遇到null，返回0
                int right=maxDepth(root.right);//向有递归，遇到null，返回0
                return left>=right?(left+1):(right+1); //从顶部0开始，返回左子树和右子树中的较大长度+1
            }
        }
    }
