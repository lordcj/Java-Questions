package interview;

import java.util.*;

/**
 * Definition for singly-linked list.
 * 
 */

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pt = null, pt1 = list1, pt2 = list2, head = null;
        while(pt1 != null && pt2 != null) {
            if (pt1.val < pt2.val) {
                if (pt != null) {
                    pt.next = new ListNode(pt1.val);
                    pt = pt.next;
                } else {
                    pt = new ListNode(pt1.val);
                    head = pt;
                }
                pt1 = pt1.next;
            } else {
               if (pt != null) {
                    pt.next = new ListNode(pt2.val);
                    pt = pt.next;
                } else {
                    pt = new ListNode(pt2.val);
                    head = pt;
                }
                pt2 = pt2.next;
            }
        }
        while (pt1!=null) {
            if (pt!=null) {
                pt.next = new ListNode(pt1.val);
                pt = pt.next;
            } else {
                pt = new ListNode(pt1.val);
                head = pt;
            }
            pt1 = pt1.next;
        }
        while (pt2!=null) {
            if (pt!=null) {
                pt.next = new ListNode(pt2.val);
                pt = pt.next;
            } else {
                pt = new ListNode(pt2.val);
                head = pt;
            }
            pt2 = pt2.next;
        }
        return head;
    }
}

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		// LeetCode solution above : https://leetcode.com/problems/merge-two-sorted-lists
	}
}
