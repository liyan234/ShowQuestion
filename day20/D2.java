package day20;

public class D2 {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode cur = pHead;

        // 分别创建两个头节点
        ListNode n = new ListNode(0);
        ListNode y = new ListNode(0);


        ListNode nLater = n;
        ListNode yLater = y;

        while (cur != null) {
            if (cur.val < x) {
                nLater.next = new ListNode(cur.val);
                nLater = nLater.next;
            } else {
                yLater.next = new ListNode(cur.val);
                yLater = yLater.next;
            }
            cur = cur.next;
        }
        ListNode node = n;
        while (node != null && node.next != null) {
            node = node.next;
        }
        node.next = y.next;
        return n.next;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
