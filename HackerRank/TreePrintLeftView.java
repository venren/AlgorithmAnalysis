package HackerRank;

import Coderpad.QueueusingStack;
import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreePrintLeftView {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer d){
            this.data  = d;
        }
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.left.left = new TreeNode(9);
        n.left.right = new TreeNode(4);
        n.left.right.right = new TreeNode(5);
        n.left.right.right.right = new TreeNode(6);
        n.right = new TreeNode(3);

        printLeftView(n);
    }

    private static void printLeftView(TreeNode n) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(n);
        while(!q.isEmpty()){
           int size = q.size();
           boolean firstIteration = true;
           while(size > 0){
               TreeNode first = q.poll();
               if(firstIteration)
                   System.out.println(first.data);

               if(null != first.left)
                   q.add(first.left);
               if(null != first.right)
                   q.add(first.right);

               size--;
               firstIteration = false;
           }
        }

    }
}
