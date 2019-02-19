package HackerRank;

import sun.reflect.generics.tree.Tree;

public class SortedArrToBST {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        int[] arr  = {1,2,3};
        TreeNode n = constructBST(arr,0,arr.length-1);
        printInOrder(n);
    }

    public static void printInOrder(TreeNode n){
        if(n == null)
            return;

        printInOrder(n.left);
        System.out.println(n.data);
        printInOrder(n.right);
    }

    private static TreeNode constructBST(int[] arr, int l, int r) {
        if(l > r)
            return null;

        if(l == r){
            return new TreeNode(arr[l]);
        }

        int mid = ((r-l)/2)+l;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = constructBST(arr,l,mid-1);
        node.right = constructBST(arr,mid+1,r);

        return node;

    }
}
