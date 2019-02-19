package AddTwoNumbers;

public class Solution {
    public  ListNode execute(ListNode l1, ListNode l2){
        int num1 = l1.val;
        int num2 = l2.val;
        int sum = 0;
        ListNode tempNode1 = l1.next;
        ListNode tempNode2 = l2.next;
        int multiplier = 10;
        ListNode result = null;
        int remainder = 0;

        if(tempNode1 == null && tempNode2 == null){
            if(num1 + num2 < 10)
            return new ListNode(num1 + num2);
            else{
                 sum = num1 + num2;
                result = new ListNode(sum % 10);
                result.next = new ListNode(sum / 10);
                return result;
            }
        }


        while(tempNode1 != null || tempNode2 != null){


            sum = num1 + num2 + remainder;
            remainder = sum / 10;
            sum = sum % 10;

            result = insertNode(sum, result);

            if(tempNode1 != null){
                num1 = tempNode1.val ;
                tempNode1 = tempNode1.next;
            }else{
                num1 = 0;
            }

            if(tempNode2 != null){
                num2 = tempNode2.val;
                tempNode2 = tempNode2.next;
            }else{
                num2 = 0;
            }

            if(tempNode1 == null && tempNode2 == null){
                sum = num1+num2+remainder;
                if(sum >= 10) {
                    insertNode(sum % 10, result);
                    insertNode(sum / 10, result);
                }else{
                    insertNode(sum,result);
                }
            }
        }

        return result;
    }

    private ListNode insertNode(int sum, ListNode result) {
        if(result == null) {
            result = new ListNode(sum );
        }else{
            if(result.next == null){
                result.next = new ListNode(sum);
            }else {
                ListNode next = result ;
                while (next.next != null) {
                    next = next.next;
                }
                next.next = new ListNode(sum);
            }
        }
        return result;
    }
}
