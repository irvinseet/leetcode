import java.util.ArrayList;
import java.util.List;

class Main {

    //Definition for singly-linked list.
    public static class ListNode {
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
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (l1 != null && l2 != null) {
            ListNode nextNode = new ListNode();
            if (l1 == null) {
                while (l2 != null) {
                    current.val = l2.val;
                    l2 = l2.next;
                }
            }
            if (l2 == null) {
                while (l1 != null) {
                    current.val = l1.val;
                    l1 = l1.next;
                }
            }
            if (l1.val < l2.val) {
                current.val = (l1.val);
                l1 = l1.next;
            } else {
                current.val = (l2.val);
                l2 = l2.next;
            }

            current.next = nextNode;
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {

    }
}