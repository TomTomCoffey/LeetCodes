public class Problem202 {
    public int countPrimes(int n) {


        if(n < 2) return 0;
        int count = 0;
        ////keep track of multiples and collect them by multiplying up 
        boolean[] muls = new boolean[n];

        for(int i = 2; i < Math.sqrt(n); i++){
            if(!muls[i]){
                for(int j = i*i; j < n; j+=i){
                    muls[j] = true;
                }
            }
        }

        for(int i = 2; i < muls.length; i++){
            if(!muls[i]) count++;
        }
        return count;
}
}
