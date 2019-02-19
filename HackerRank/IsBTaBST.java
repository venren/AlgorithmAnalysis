package HackerRank;

public class IsBTaBST {
    private static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static boolean isBST(TreeNode n){
        if(n == null){
            return true;
        }

        if(n.right == null && n.left == null){
            return true;
        }

        if(null != n.left)
            if(n.data < n.left.data)
                return false;

        if(null != n.right)
            if(n.right.data < n.data)
                return false;


        if(isBST(n.left) && isBST(n.right))
         return true;
        else
         return false;

    }

    public static void printInOrder(TreeNode t){
       if(t == null)
           return;

       printInOrder(t.left);
        System.out.println(t.data);
        printInOrder(t.right);
    }

    public static void main(String[] args) {
        TreeNode t = new TreeNode(8);
        t.left = new TreeNode(7);
        t.left.left = new TreeNode(6);
        t.right = new TreeNode(9);
        t.right.right = new TreeNode(5);
        System.out.println(isBST(t));
        printInOrder(t);
    }
}
