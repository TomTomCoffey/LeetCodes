public class Solution
{
    public int PairSum(ListNode head)
    {

        int sum = 0;
        List<int> al = new List<int>();

        ListNode temp = head;
        while (temp != null)
        {
            al.Add(temp.val);
            temp = temp.next;
        }
        int left = 0;
        int right = al.Count - 1;
        while (left < right)
        {
            if (sum < (al[left] + al[right]))
            {
                sum = al[left] + al[right];
            }
            left++;
            right--;
        }



        return sum;

    }
}