package com.company.al.easy;

import com.company.al.model.ListNode;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode mergedList;
        if (list1.val < list2.val) {
            mergedList = list1;
            mergedList.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedList = list2;
            mergedList.next = mergeTwoLists(list1, list2.next);
        }

        return mergedList;
    }

    public static void main(String[] args) {

        // Create the first sorted linked list: 1 -> 2 -> 4
//        ListNode list1 = new ListNode(1);
//        list1.next = new ListNode(2);
//        list1.next.next = new ListNode(4);

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));

        // Create the second sorted linked list: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode solution = new MergeTwoLists().mergeTwoLists(list1, list2);

        System.out.println(solution.toString());
    }
}
