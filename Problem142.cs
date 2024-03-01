public class Solution
{
    public ListNode DetectCycle(ListNode head)
    {

        var set = new HashSet<ListNode>();
        ListNode temp = head;

        while (temp != null)
        {
            if (set.Contains(temp))
            {
                return temp;
            }
            set.Add(temp);
            temp = temp.next;
        }
        return null;
    }
}