package Tree;

import sun.reflect.generics.tree.Tree;

public class LCA {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static TreeNode findLCA(TreeNode n, Integer a, Integer b){

        if(n == null)
            return null;

        if(n.data == a || n.data == b){
            return n;
        }

        TreeNode left = findLCA(n.left,a,b);
        TreeNode right = findLCA(n.right,a,b);

        if(left!=null && right != null)
            return n;

        return (left!=null) ? left : right;
    }

    public static void main(String[] args) {
        TreeNode n = new TreeNode(1);
        n.left = new TreeNode(2);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(5);

        n.right = new TreeNode(3);
        n.right.left = new TreeNode(6);
        n.right.right = new TreeNode(7);

        System.out.println(findLCA(n,4,5).data);

    }
}
