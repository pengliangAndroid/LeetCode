package com.funny;

public class TwoNumberAdd {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        TwoNumberAdd twoNumberAdd = new TwoNumberAdd();
        ListNode node = twoNumberAdd.addTwoNumbers(l1, l2);
        while (node != null){
            System.out.println(node.val);
            node = node.next;
        }

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);

        ListNode p = resultNode;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0){
            int value = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = value / 10;

            p.next = new ListNode(value % 10);
            p = p.next;

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        return resultNode.next;
    }

    public static class ListNode{
        int val;

        ListNode next;

        ListNode(int x){
            this.val = x;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
}
