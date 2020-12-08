package HackerRank;

public class Citrix {
    /**
     *
     */
    public Citrix() {
        System.out.println("Citrix: ");
    }

    public static void main(String[] args) {
        Citrix problem43 = new Citrix();
        System.out.println(problem43.lotteryCoupons(3));
        System.out.println(problem43.getShiftedString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab",1000,2));
    }

    public int lotteryCoupons(int n) {
        int sum = 0;
        int loop = n;
        while(loop>0){
            sum+= n%10;
            loop = loop/10;
        }
        System.out.println("sum " + sum);
        System.out.println(3%10 + 1);
        if(sum>9){
            return ((n - n%9)%10)+1;
        }else{
            if(n<20){
                return n%10;
            }
            return n%10 + 1;
        }



    }

    public  String getShiftedString(String s, int leftShifts, int rightShifts) {
        // Write your code here
        if(leftShifts>rightShifts){
            leftShifts -= rightShifts;
            rightShifts = 0;
        }else if(rightShifts>leftShifts){
            rightShifts-= leftShifts;
            leftShifts = 0;
        }else{
            return s;
        }

        System.out.println("leftShift" + leftShifts);
        System.out.println("rightShjift" + rightShifts);
        String remainder;
        if(leftShifts>0){
            leftShifts%= s.length();
            String left = s.substring(0,leftShifts);
            remainder = s.substring(leftShifts);
            return remainder + left;
        }else{
            rightShifts%= s.length();
            String right = s.substring(s.length() - rightShifts);
            remainder = s.substring(0, s.length() -rightShifts);
            return right + remainder;
        }





    }

}