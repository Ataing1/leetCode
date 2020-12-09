package NodeSandbox;

public class Node {
    int val;
    public Node(int val){
        this.val = val;
    }
    Node next;
    Node() {}

    Node(int val, Node next) { this.val = val; this.next = next; }

}
