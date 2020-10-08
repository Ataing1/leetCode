public class Problem1578 {
    /**
     *
     */
    public Problem1578() {
        System.out.println("Problem1578: ");
    }

    public int minCost(String s, int[] cost) {
        int last = 0;
        int ret = 0;
        for(int i = 1;i<s.length();i++){
            if(s.charAt(last) == s.charAt(i)){
                //DEBUG System.out.println(String.format("%c (%d) = %c (%d), removal cost %d, total %d", s.charAt(last), cost[i-1], s.charAt(i), cost[i], Math.min(cost[i], cost[i-1]), ret ));
                if(cost[i]<=cost[last]){
                    ret += cost[i];
                }else{
                    ret +=cost[last];
                    last = i;
                }
            }else{
                last = i;
            }
        }
        return ret;
    }

}