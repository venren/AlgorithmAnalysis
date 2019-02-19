public class ListLoopDetection {
    public static class Node{
        int data;
        Node next;

        public Node(int i,Node n){
            data = i;
            next = n;
        }
    }

    public static void main(String args[]){
        Node n5 = new Node(5,null);
        Node n4 = new Node(4,n5);
        Node n3 = new Node(3,n4);
        Node n2 = new Node(2,n3);
        Node n1 = new Node(1,n2);
        Node n0 = new Node(0,n1);
        n5.next = n0;
        findLoop(n5);
    }

    private static void findLoop(Node n0) {
        Node t = n0;
        Node fast = null,slow = null;
        boolean loopDetected = false;
        if(n0 != null){
            fast = n0;
            slow = n0;
        }

        if(n0 == null || n0.next == null){
            System.out.println("No loop");
            return;
        }
        
        while(fast != null && slow != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast.data == slow.data ){
                System.out.println("Loop detected with data " + fast.data);
                loopDetected = true;
                break;
            }


        }

        if(loopDetected){
            slow = t;
            while (fast != slow){
                fast = fast.next;
                slow = slow.next;
            }
            System.out.println("Loop at " + fast.data);
        }
    }
}
