package Tree;

import sun.reflect.generics.tree.Tree;

public class BST_DeletePathWtLessThanThreshold {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left =  new TreeNode(30);
        root.left.left = new TreeNode(20);
       root.left.right = new TreeNode(40);

        root.right =  new TreeNode(70);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        int thresholdWt = 110;

        deletePathWithWeightlessThanThreshold(0,root,root,thresholdWt);
    }

    public static TreeNode deleteNode(Integer data, TreeNode n){
        if(n.data > data){
            n.left =  deleteNode(data,n.left);
            return n;
        }else if(n.data < data){
           n.right =  deleteNode(data,n.right);
           return n;
        }

        if(n.left == null)
            return n.right;

        if(n.right == null)
            return n.left;


        if(n.left != null && n.right != null){
            TreeNode rightMin = findMin(n.right);
            n.data = rightMin.data;
            n.right = deleteNode(rightMin.data,n.right);
            return n;
        }

        return n;

    }

    private static TreeNode findMin(TreeNode right) {
        if(right.left != null)
            return findMin(right.left);
        else
            return right;

    }

    private static void deletePathWithWeightlessThanThreshold(int pathWt,
                                                              TreeNode root,
                                                              TreeNode currentNode,
                                                              int thresholdWt) {
        if(currentNode == null)
            return;

        if(currentNode.left == null && currentNode.right == null){
            pathWt += currentNode.data;
            if(pathWt < thresholdWt){
                root = deleteNode(currentNode.data,root);
                deletePathWithWeightlessThanThreshold(0,root,root,thresholdWt);
            }
        }else{
            pathWt += currentNode.data;
        }

        deletePathWithWeightlessThanThreshold(pathWt,root,currentNode.left,thresholdWt);
        deletePathWithWeightlessThanThreshold(pathWt,root,currentNode.right,thresholdWt);
    }
}
