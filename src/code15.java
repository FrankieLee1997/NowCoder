public class code15 {
    public static class ListNode {
        int value;
        ListNode next = null;

        ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode reverseList(ListNode listNode){
        ListNode prev = null;
        if(listNode.next == null)
            return listNode;
        while (listNode != null){
            ListNode next = listNode.next;
            listNode.next = prev;
            prev = listNode; //后移前置指针
            listNode = next; //后移原始指针
        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(6);
        listNode.next.next.next = new ListNode(7);
        listNode.next.next.next.next = new ListNode(8);

        code15 code15 = new code15();
        ListNode reverselist = code15.reverseList(listNode);
        while (reverselist.next != null){
            System.out.println(reverselist.value);
        }
    }
}
