package NodeSandbox;

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
    }
}
