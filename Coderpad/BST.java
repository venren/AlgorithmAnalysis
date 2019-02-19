package Coderpad;


import java.util.LinkedList;
import java.util.Queue;

public class BST{

    Node root;

    public BST(Integer data){
        root = new Node();
        root.data = data;
        root.left = null;
        root.right = null;
    }

    public class Node{
        Integer data;
        Node left;
        Node right;
    }

    public Node insert(Integer data){
        Node n = new Node();
        n.data = data;

        if(root == null){
            root = n;
            return root;
        }

        Node next = root;

        while( null != next){
            if(next.data > data){

                    next = next.left;

            }else{

                    next = next.right;

            }
        }

        next = n;
        return n;
    }

    public void printTree(){
        if(null == root){
            System.out.println("Tree is empty");
            return;
        }

        Node n = root;
        Queue<Node> q = new LinkedList();
        q.add(n);
        while(q.peek() != null){
            Node t =  q.poll();
            System.out.println(t.data);
            if(t.left != null)
                q.add(t.left);
            if(t.right != null)
                q.add(t.right);
        }

    }

}
