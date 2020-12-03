import java.util.Arrays;

public class code14 {
    public static class ListNode {
        int value;
        ListNode next = null;

        ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode findKNum(ListNode listNode, int k){
        if(listNode == null)
            return null;
        ListNode curr = listNode; //当前指针
        int count = 0;
        while (curr != listNode){
            curr = curr.next;
            count ++;
        }
        if(k>count || k<0)
            return null;
        int flag = count - k + 1;
        curr = listNode;
        while (flag > 0){
            curr = curr.next;
            flag -- ;
        }
        return curr;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(7);
        listNode.next.next.next.next = new ListNode(9);

        code14 code14 = new code14();
        ListNode curr_node = code14.findKNum(listNode, 3);
        System.out.println(curr_node.value);
    }
}
