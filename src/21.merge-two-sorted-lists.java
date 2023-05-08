/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start

// Definition for singly-linked list.

class ListNode {
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

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // if(list1 == null && list2 != null){
        // return new ListNode(list2.val);
        // } else if(list1 != null && list2 == null){
        // return new ListNode(list1.val);
        // } else {
        // if(list1.val <= list2.val){
        // return mergeTwoLists(new ListNode(list1.val, list2), list2);
        // } else {
        // return mergeTwoLists(new ListNode(list2.val, list1), list1);
        // }
        // }


        ListNode l1 = list1;
        ListNode l2 = list2;

        if(l1 == null) return l2;
        else if(l2 == null) return l1;
        
        ListNode next = list1.val <= list2.val ? list1 : list2;
        ListNode toReturn = next;

        while (next != null) {
            if (l1.val <= l2.val) {
                next = new ListNode(l1.val, next);
                l1 = l1.next;
            } else if (l2.val < l1.val) {
                next = new ListNode(l2.val, next);
                l2 = l2.next;
            }
        }

        return toReturn;

    }
}
// @lc code=end
