import java.util.HashMap;

public class Problem1208 {
    
    public int equalSubstring(String s, String t, int maxCost) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int last = 0;
        int currentCost = 0;
     
        for(int i = 0; i < s.length(); i++){
            map.put(i, Math.abs((int)s.charAt(i)-(int)t.charAt(i)));
        }

        for(int i = 0; i < s.length(); i++){
            currentCost += map.get(i);
            
            if(currentCost > maxCost){
                currentCost -= map.get(last);
                last++;

            }
            else{
                max = Math.max(max, i-last + 1);
                
            }

        }

        return max;

        
       
    }
}
