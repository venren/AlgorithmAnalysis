package HackerRank;

public class ListPairSwap {
    public static class ListNode{
        Integer data;
        ListNode next;

        public ListNode(Integer data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        performPairSwap(node);
        print(node);
    }

    private static void print(ListNode node) {
        ListNode temp = node;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private static void performPairSwap(ListNode node) {
        ListNode temp = node;
        while(temp != null && temp.next != null){
            Integer tempData = temp.data;
            temp.data = temp.next.data;
            temp.next.data = tempData;
            temp = temp.next.next;
        }

    }
}
