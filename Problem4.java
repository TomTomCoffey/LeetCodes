package LeetCodes;

public class Problem4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double[] ans = new double[nums1.length + nums2.length];
      
       int index = 0;
       int point1 = 0;
       int point2 = 0;
        
        while(point1 < nums1.length && point2 < nums2.length)
        {
            if(nums1[point1] <= nums2[point2])
            {
                ans[index++] = nums1[point1++];
            }
            else{
                ans[index++] = nums2[point2++];
            }   
            
        }
        while(point1 < nums1.length)
        {
            ans[index] = nums1[point1];
            index++;
            point1++;
        }
        while(point2 < nums2.length)
        {
            ans[index] = nums2[point2];
            index++;
            point2++;
        }
        
       

return ans.length% 2 == 0 ? (ans[ans.length/2]+ans[(ans.length/2)-1])/2 : ans[ans.length/2];
        
       
        
    }
    
}
