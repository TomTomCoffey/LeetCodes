/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    public int KthSmallest(TreeNode root, int k) {

        var heap = new SortedSet<int>();
        int ans = 0;
        helper(heap, root);

        while(k > 0){
          ans = heap.Min;
           heap.Remove(heap.Min);
           k--;
        } 
        return ans;
    }
    public void helper(SortedSet<int> heap, TreeNode root){

        if(root == null) return;
        helper(heap, root.left);
        heap.Add(root.val);
        helper(heap, root.right);
    }
}