package HackerRank;

public class IsBSTBalanced {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }
    
    public static boolean isBSTBalanced(TreeNode n) {
        if(n == null)
            return true;
        
        int leftHeight = getHeight(n.left);
        int rightHeight = getHeight(n.right);
        
       if(Math.abs(leftHeight - rightHeight) <= 1)
           return true;

       return false;
        
    }

    private static int getHeight(TreeNode n) {
        if(n == null)
            return 0;

        int lHeight = getHeight(n.left);
        int rHeight = getHeight(n.right);

        return Math.max(lHeight,rHeight)+1;
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);

        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.right.right = new TreeNode(6);
        tree.left.left.left = new TreeNode(7);
        tree.left.left.left.left = new TreeNode(9);
        System.out.println(isBSTBalanced(tree));

    }
}
