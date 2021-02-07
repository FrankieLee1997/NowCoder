public class code16 {
    public static class ListNode {
        int value;
        ListNode next = null;

        ListNode(int value) {
            this.value = value;
        }
    }

    //    合并两个递增链表
    public ListNode mergeList(ListNode listNode1, ListNode listNode2){
        ListNode tmp;
        if(listNode1 == null || listNode2 == null)
            return null;
        ListNode curr1 = listNode1;
        ListNode curr2 = listNode2;
        if (listNode1 == null){
            return listNode2;
        }
        if (listNode2 == null){
            return listNode1;
        }
        if (listNode1.value <= listNode2.value){
            tmp = listNode1;
            tmp.next = mergeList(listNode1.next, listNode2);
        }
        else {
            tmp = listNode2;
            tmp.next = mergeList(listNode1, listNode2.next);
        }
        return tmp;
    }

    public static void main(String[] args){

    }
}
