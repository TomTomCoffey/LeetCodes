import java.util.HashMap;
import java.util.Map;

public class Problem189 {
    
     public void rotate(int[] nums, int k) {

        if(k > nums.length) k%=nums.length;   
        HashMap<Integer, Integer> map = new HashMap<>();
  
        for(int i = 0; i < nums.length; i++){      
            if((i + k) >= nums.length){       
                map.put(((nums.length - (i+k)) * -1), nums[i]);
            }
            else{
                map.put((i+k), nums[i]);
            }
        }

       for(Map.Entry<Integer, Integer> element: map.entrySet()){
           nums[element.getKey()] = element.getValue();
       }
        
    }
}
