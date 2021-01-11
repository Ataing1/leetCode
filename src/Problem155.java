public class Problem155 {
    /**
     *Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
     *
     * push(x) -- Push element x onto stack.
     * pop() -- Removes the element on top of the stack.
     * top() -- Get the top element.
     * getMin() -- Retrieve the minimum element in the stack.
     *
     *
     * Example 1:
     *
     * Input
     * ["MinStack","push","push","push","getMin","pop","top","getMin"]
     * [[],[-2],[0],[-3],[],[],[],[]]
     *
     * Output
     * [null,null,null,null,-3,null,0,-2]
     *
     * Explanation
     * MinStack minStack = new MinStack();
     * minStack.push(-2);
     * minStack.push(0);
     * minStack.push(-3);
     * minStack.getMin(); // return -3
     * minStack.pop();
     * minStack.top();    // return 0
     * minStack.getMin(); // return -2
     *
     *
     * Constraints:
     *
     * Methods pop, top and getMin operations will always be called on non-empty stacks.
     */
    public Problem155() {
        System.out.println("Problem155: ");
    }

    public static void main(String[] args) {
        Problem155 test = new Problem155();
    }

}

/*
class MinStack {

    ArrayList<Integer> arrayList = new ArrayList<>();

    */

/**
 * initialize your data structure here.
 *//*

    public MinStack() {
        arrayList = new ArrayList<>();
    }

    public void push(int x) {
        this.arrayList.add(x);
    }

    public void pop() {
        this.arrayList.remove(arrayList.size()-1);
    }

    public int top() {
        return this.arrayList.get(arrayList.size()-1);
    }

    public int getMin() {
        int smallest = arrayList.get(0);
        for(int x: arrayList){
            if(smallest>=x){
                smallest = x;
            }
        }
        return smallest;
    }
}*/

class LinkList {
    int val;
    LinkList next;

    public LinkList(int val) {
        this.val = val;
    }

}

class MinStack {

    LinkList head;
    public MinStack() {
        head = null;
    }

    public void push(int x) {
       if(head == null){
           head = new LinkList(x);
       }else{
           LinkList linkList = new LinkList(x);
           linkList.next = head;
           head = linkList;
       }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        LinkList temp = head;
        int smallest = head.val;
        while(temp!=null){
            smallest = Math.min(smallest, temp.val);
            temp = temp.next;
        }
        return smallest;
    }
}

/*class MinStack {

    LinkedList<Integer> linkedList;

    *//**
     * initialize your data structure here.
     *//*
    public MinStack() {
        linkedList = new LinkedList<>();
    }

    public void push(int x) {
        this.linkedList.push(x);
    }

    public void pop() {
        this.linkedList.pop();
    }

    public int top() {
        return this.linkedList.getFirst();
    }

    public int getMin() {
        ListIterator<Integer> listIterator = linkedList.listIterator(0);
        int smallest = listIterator.next();
        while (listIterator.hasNext()) {
            smallest = Math.min(smallest, listIterator.next());
        }
        return smallest;
    }
}*/
