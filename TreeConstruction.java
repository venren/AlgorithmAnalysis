import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }


    public static class Pair{
        TreeNode data;
        Integer level;

        public Pair(TreeNode a, Integer b){
            this.data = a;
            this.level = b;
        }
    }

        public static void main(String[] args) {
            TreeNode tn = new TreeNode(3);
            tn.left = new TreeNode(9);
            tn.right = new TreeNode(20);
            tn.right.left = new TreeNode(15);
            tn.right.right = new TreeNode(7);
            levelOrder(tn);
            
        }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        int level = 0;
        Queue<Pair> queue = new LinkedList<>();
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        queue.add(new Pair(root,level));
        while(!queue.isEmpty()){
            Pair p = ((LinkedList<Pair>) queue).pop();
            if(result.size() <= p.level  ){
                List<Integer> addL = new ArrayList<>();
                addL.add(p.data.val);
                result.add(p.level,addL);
            }else{
                result.get(p.level).add(p.data.val);
            }

            if(null != p.data.right)
                ((LinkedList<Pair>) queue).push(new Pair(p.data.right,p.level+1));
            if(null != p.data.left)
                ((LinkedList<Pair>) queue).push(new Pair(p.data.left,p.level+1));

        }

        return result;

    }
}