import java.util.*;

public class Tree {
    public static class TreeNode{
        Integer data;
        TreeNode left;
        TreeNode right;

        public TreeNode(Integer data) {
            this.data = data;
        }
    }

    public static Integer maxDepth(TreeNode n){
        if(n==null)
            return 0;
        int leftDepth = maxDepth(n.left)+1;
        int righDepth = maxDepth(n.right)+1;
        return Integer.max(leftDepth,righDepth);
    }

    public static void inOrderTraversal(TreeNode n){
        if(n == null){
            return;
        }

        inOrderTraversal(n.left);
        System.out.println(n.data);
        inOrderTraversal(n.right);
    }

    public static void preOrderRecursive(TreeNode n){
        if(n == null){
            return;
        }
        System.out.println(n.data);
        preOrderRecursive(n.left);
        preOrderRecursive(n.right);
    }

    public static void postOrderRecursive(TreeNode n){
        if(n == null){
            return;
        }

        postOrderRecursive(n.left);
        postOrderRecursive(n.right);
        System.out.println(n.data);
    }

    public static void postorderIterative(TreeNode n){
        if(n == null)
            return;

        Stack<TreeNode> st = new Stack<>();
        st.push(n);

        TreeNode prev = null;

        while(!st.isEmpty()){
            TreeNode curr = st.peek();
            if(prev == null || prev.left == curr || prev.right == curr){
                if(curr.left != null){
                    st.push(curr.left);
                }else if(curr.right != null){
                    st.push(curr.right);
                }else{
                    System.out.println(st.pop().data);
                }
            }else if(curr.left == prev){
                if(curr.right != null){
                    st.push(curr.right);
                }else{
                    System.out.println(st.pop().data);
                }
            }else if(curr.right == prev){
                System.out.println(st.pop().data);
            }
            prev = curr;
        }
    }

    public static void preOrderIterative(TreeNode n){

        Stack<TreeNode> st = new Stack<>();
        st.push(n);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            System.out.println(curr.data);
            if(null != curr.right)
                st.push(curr.right);
            if(null != curr.left)
                st.push(curr.left);

        }

    }

    public static void levelOrderTraversal(TreeNode n){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            System.out.println(curr.data);
            if(null != curr.left)
                queue.add(curr.left);

            if(null != curr.right)
                queue.add(curr.right);

        }


    }

    public static void inOrderTraversalIterative(TreeNode n){
        Stack<TreeNode> st = new Stack<>();
       TreeNode current = n;
       while(!st.isEmpty() || null != current){
           while(current != null){
               st.push(current);
               current = current.left;
           }
           TreeNode top = st.pop();
           System.out.println(top.data);
           current = top.right;
       }
    }


    public static void main(String[] args) {
        TreeNode n = new TreeNode(20);
        n.left = new TreeNode(8);
        n.left.left = new TreeNode(4);
        n.left.right = new TreeNode(12);
        n.left.right.left = new TreeNode(10);
        n.left.right.right = new TreeNode(14);
        n.right = new TreeNode(22);

        levelOrderTraversal(n);

    }
}
