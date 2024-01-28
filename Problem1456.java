import java.util.HashSet;

public class Problem1456 {
     public int maxVowels(String s, int k) {

        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('i');
        set.add('e');
        set.add('o');
        set.add('u');
        int max = count(set, s.substring(0,k));
        int temp = max;
        for(int i = 1; i < s.length()-k+1; i++){
             
            if(set.contains(s.charAt(i-1)))temp--;

            if(set.contains(s.charAt(i+k-1))) temp++;
      
            if(temp > max) max = temp;


        }

        return max;
       
    }
    private int count(HashSet<Character> set, String in){

        int count = 0; 
        char[] c = in.toCharArray();

        for(int i = 0; i < c.length; i++)
            if(set.contains(c[i]))
                count++;

        return count;


    }
}
