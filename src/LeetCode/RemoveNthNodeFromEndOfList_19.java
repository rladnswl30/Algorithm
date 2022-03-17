package LeetCode;

public class RemoveNthNodeFromEndOfList_19 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        System.out.println(removeNthFromEnd(head, 2).toString());
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode();
        node.next = head;

        ListNode left = node;
        ListNode right = node;

        for (int i = 0; i < n + 1; i++) {
            left = left.next;
        }
//        System.out.println(current.toString());

        while (left != null) {
            left = left.next;
            right = right.next;
        }

//        System.out.println(nthNode.toString());
        right.next = right.next.next;

        return node.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
        }
    }
}

//    public static ListNode removeNthFromEnd(ListNode head, int n) {
//        int length = 1;
//        ListNode list = head;
//        while (list.next != null) {
//            length++;
//            list = list.next;
//        }
//
//        ListNode current = head;
//        ListNode prev = head;
//
//        if (length == n) {
//            head = current.next;
//        } else {
//            int idx = 0;
//            while (idx++ < length - n) {
//                prev = current;
//                current = prev.next;
//            }
//            prev.next = current.next;
//        }
//        current.next = null;
//
//        return head;
//    }
//
