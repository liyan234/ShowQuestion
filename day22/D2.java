package day22;

import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
public class D2 {
    public ListNode plusAB(ListNode a, ListNode b) {
        // 转变成整形
        int aValue = helpChangeInt(a);
        int bValue = helpChangeInt(b);

        int sumValue = aValue + bValue;
        // 然后把值转变成链表
        ListNode node = helpChangeListNode(sumValue);
        return node;
    }

    public int helpChangeInt(ListNode cur) {
        StringBuilder st = new StringBuilder();
        ListNode node = cur;
        while (node != null) {
            st.append(node.val);
            node = node.next;
        }
        //需要把st反转
        return Integer.valueOf(st.reverse().toString());
    }

    // 链表的首位放着的是个位
    public ListNode helpChangeListNode(int value) {
        ListNode node = null;
        //尾插法
        ListNode hh = null;
        while (value != 0) {
            int x = value % 10;
            if (node == null) {
                node = new ListNode(x);
                hh = node;
            } else {
                ListNode cur = new ListNode(x);
                hh.next = cur;
                hh = hh.next;
            }

            value = value / 10;
        }
        return node;
    }
}
