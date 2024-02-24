
public class Solution
{
    public int Reverse(int x)
    {

        string temp = "";
        temp += x;

        if (x < 0)
        {
            x = -1;
            temp = temp.Substring(1);
        }
        else
        {
            x = 1;
        }

        string helper = "";

        for (int i = temp.Length - 1; i >= 0; i--)
        {
            helper += temp[i];
        }

        int ans;

        if (int.TryParse(helper, out ans))
        {
            ans *= x;
            Console.WriteLine(ans);
            return ans;
        }
        else
        {
            return 0;
        }






        return x;





    }
}