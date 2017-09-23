/**
* 合并两个排序过的链表
*/
public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode cur = new ListNode(Integer.MIN_VALUE);
		ListNode head = cur;
		while (l1 != null || l2 != null) {
			if (l1 == null && l2 != null) {
				cur = appendTo(cur, l2.val);
				l2 = l2.next;
			} else if (l1 != null && l2 == null) {
				cur = appendTo(cur, l1.val);
				l1 = l1.next;
			} else {
				if (l1.val < l2.val) {
					cur = appendTo(cur, l1.val);
					l1 = l1.next;
				} else if (l1.val > l2.val) {
					cur = appendTo(cur, l2.val);
					l2 = l2.next;
				} else {
					cur = appendTo(cur, l1.val);
					l1 = l1.next;
					cur = appendTo(cur, l2.val);
					l2 = l2.next;
				}
			}
		}
		return head.next;
    }
    private ListNode appendTo(ListNode node, int val) {
		if (node == null) {
			return new ListNode(val);
		} else {
			node.next = new ListNode(val);
			return node.next;
		}
	}
}
