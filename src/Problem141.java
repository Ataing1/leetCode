import java.util.HashSet;

public class Problem141 {
    /**
     *Given head, the head of a linked list, determine if the linked list has a cycle in it.
     *
     * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
     *
     * Return true if there is a cycle in the linked list. Otherwise, return false.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
     * Example 2:
     *
     *
     * Input: head = [1,2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
     * Example 3:
     *
     *
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     *
     *
     * Constraints:
     *
     * The number of the nodes in the list is in the range [0, 104].
     * -105 <= NodeSandbox.Node.val <= 105
     * pos is -1 or a valid index in the linked-list.
     */
    public Problem141() {
        System.out.println("Problem141: ");
    }

    public static void main(String[] args) {
        Problem141 test = new Problem141();
        HashSet<String> hashSet = new HashSet<>();

    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
     }
 }
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        while(head.next!=null){
            if(head.val == 100001){
                return true;
            }else{
                head.val = 100001;
            }
            head = head.next;
        }
        return false;


    }

}