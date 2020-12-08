public class Problem7 {
    /**
     *
     */
    public Problem7() {
        System.out.println("7: ");
    }

    public static void main (String []args){
        Problem7 problem7 = new Problem7();
        System.out.println(problem7.reverse(964351));
    }


    public int reverse(int x) {
        int result = 0;
        if(Math.abs(x)>Math.pow(2,31)-1){
            return 0;
        }
        boolean neg = x<0;
        x = Math.abs(x);
        while(x>0){
            result = result *10 + x%10;

            x = x/10;

        }

        return result;
    }

}