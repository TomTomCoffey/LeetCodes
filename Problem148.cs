/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution
{
    public ListNode SortList(ListNode head)
    {

        var helper = new List<int>();
        ListNode temp = head;
        while (temp != null)
        {
            helper.Add(temp.val);
            temp = temp.next;

        }
        helper.Sort();
        temp = head;
        for (int i = 0; i < helper.Count; i++)
        {
            temp.val = helper[i];
            temp = temp.next;
        }
        return head;
    }
}