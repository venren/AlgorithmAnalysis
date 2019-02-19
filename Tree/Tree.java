package Tree;


import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tree {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static Integer getHeight(TreeNode n){
        if(n == null)
            return 0;

        int left = getHeight(n.left)+1;
        int right = getHeight(n.right)+1;

        return Integer.max(left,right);
    }

    public static void printLevelWise(TreeNode n){
        if(n == null)
            return;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(n);

        while(!q.isEmpty()){
            TreeNode qnode = q.poll();
            System.out.println(qnode.data);

            if(null != qnode.left)
                q.add(qnode.left);
            if(null != qnode.right)
                 q.add(qnode.right);

        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(5);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);

        //System.out.println(getHeight(root));
        printLevelWise(root);
    }
}
