package LeetCodes;

public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode head = new ListNode();
        ListNode l3 = head;
           
        
        
        while(l1!=null && l2!=null)
        {  
         
         
            sum = l1.val + l2.val + carry;
            carry = sum / 10;
            sum = sum%10;
          //  System.out.println(sum);
         
            l3.val = sum;
       
            if(l1.next != null && l2.next != null)
            { l3.next = new ListNode();
                   l3 = l3.next;}
         
              
            l1 = l1.next;
            l2 = l2.next;
            
        }
        while(l1 != null)
        {
            l3.next = new ListNode();
            l3 = l3.next;
            sum = l1.val + carry;
            carry = sum/10;
            sum%=10;
            l3.val = sum;
            l1 = l1.next;
            
        }
        while(l2 != null)
        {
            l3.next = new ListNode();
            l3 = l3.next;
            sum = l2.val + carry;
            carry = sum/10;
            sum%=10;
            l3.val = sum;
          
            l2 = l2.next;
            
        }
        
        if(carry > 0)
        {
            l3.next = new ListNode();
            l3 = l3.next;
            l3.val = carry;
        }
        
        
        
        return head;
        
    }
    
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val,ListNode next) { this.val = val; this.next = next; }
}
