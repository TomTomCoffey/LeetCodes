public class Solution {
    public ListNode DeleteMiddle(ListNode head) {

        if(head.next == null){
            return null;
        }

        int len = size(head);

        if(len == 0) return null;
        if(len == 1){
            head.next = null;
            return head;
        }

        len = len/2;
        ListNode temp = head;

        for(int i = 0; i < len-1; i++){
            temp = temp.next;
        }

        ListNode target = temp.next;
        target = target.next;
        temp.next = target;

        return head;  
    }
    public int size(ListNode temp){
        int size = 0;

        while(temp != null){
            temp = temp.next;
            size++; 
        }
        return size;
    }

}