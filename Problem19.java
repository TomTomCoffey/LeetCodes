
public class Problem19 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        
 
        int index = size(head)-n;
        
         if(index == size(head))
        {
            ListNode temp = get(head, size(head)-1);
            temp.next = null;
            return head;
            
        }
        
        if(index==0)
        {
            head = head.next;
            return head;
        }

        ListNode beglist = get(head, index-1);
        ListNode endlist = get(head, index+1);
        beglist.next = endlist;
        
        return head;    
    
    }
    
    public int size(ListNode head)
    {
        int size = 0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            size++;
        }
        
        return size;
    }
    
    public ListNode get(ListNode head, int i)
    {
        ListNode temp = head;
        int count = 0;
        while(count != i)
        {
            temp = temp.next;
            count++;
        }
        return temp;
    }
    
}
