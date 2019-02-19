package Tree;

public class MaxMin {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static Integer findMax(TreeNode n){

        if(null == n)
            return 0;

        Integer data = n.data;

        Integer leftMAx = (n.left != null ) ? findMax(n.left) : 0;
        Integer rightMax= (null != n.right) ? findMax(n.right) : 0;
        Integer result = data;

        if(result < leftMAx ){
            result = leftMAx;
        }

        if(result < rightMax){
            result = rightMax;
        }

        return result;
    }

    public static Integer maxDepth(TreeNode e){
        if(e == null )
            return 0;

        return Integer.max(maxDepth(e.left),maxDepth(e.right))+1;

    }

    public static Integer minDepth(TreeNode e){
        if(e == null )
            return 0;

        int left = minDepth(e.left);
        int right = minDepth(e.right);

        return Integer.min(left,right)+1;

    }

    public static Integer findMin(TreeNode n){

        if(null == n)
            return 0;

        Integer data = n.data;

        Integer leftMAx = (n.left != null ) ? findMin(n.left) : 0;
        Integer rightMax= (null != n.right) ? findMin(n.right) : 0;
        Integer result = data;

        if(result > leftMAx && leftMAx != 0){
            result = leftMAx;
        }

        if(result > rightMax &&  rightMax != 0){
            result = rightMax;
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(0);
        System.out.println(minDepth(root));
        System.out.println(maxDepth(root));

    }
}
