import java.util.ArrayList;


//class ListNode {
//    int value;
//    ListNode next = null;
//
//    ListNode(int value) {
//        this.value = value;
//    }
//}

public class code3 {

    public static class ListNode {
        int value;
        ListNode next = null;

        ListNode(int value) {
            this.value = value;
        }
    }

    public static ArrayList<Integer> reverseList(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<Integer>();

        if(listNode != null){
            list = reverseList(listNode);
            list.add(listNode.value);
        }
        return list;
    }

    public static void main(String[] args){
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(7);
        listNode.next.next.next.next = new ListNode(9);

        ArrayList<Integer> list = reverseList(listNode);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }

        System.out.println();
    }
}
