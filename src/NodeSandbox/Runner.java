package NodeSandbox;

import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;

public class Runner {

    public static void main (String [] args){
        Node x = new Node(15);
        Node y = new Node();
        System.out.println(y.val);
        int a = 10;
        int b = 20;
        a = b;
        b = 50;
        System.out.println(a + "  " + b);
        int g = 39329329;
        for(int i = 0;i<20;i++){
            System.out.println(g);
            g>>>=1;
        }

        String one = "one";
        String two = "two";
        System.out.println( "int : " + one.compareTo(two));

        int[] pastDays = new int[424];
        int[] twenty = new int[]{4,24,24,2,4};
        System.arraycopy(twenty, 0, pastDays, 0, 4);
        System.out.println(Arrays.toString(pastDays));
    }
}
