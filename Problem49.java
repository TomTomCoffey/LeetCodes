import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem49 {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        char[] c;

        for(int i = 0; i < strs.length; i++){

            c = strs[i].toCharArray();
            Arrays.sort(c);

            if(map.containsKey(String.valueOf(c))){
                map.get(String.valueOf(c)).add(strs[i]);

            }
            else{
                map.put(String.valueOf(c), new ArrayList<>());
            }

        }

          for(Map.Entry<String, List<String>> element: map.entrySet()){

             ans.add(element.getValue());
         }
        return ans;
        
    }
    
}
