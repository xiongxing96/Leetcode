package leetcode0_50;

/**
 * ������n����Ч��
 * ɾ������ĵ�����N���ڵ�
 * ���n,һ��ɨ�跨
 * @author xx
 *
 */

public class T19 {
	class ListNode{
		public int value;
		public ListNode next;
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode right = head;
		ListNode left = head;
		for(int i=0;i<n;i++) {
			right = right.next;
		}
		if(right == null) {
			head = head.next;
			return head;
		}
		while(right.next != null) {
			right = right.next;
			left = left.next;
		}
		left =left.next.next;
		return head;
	}
}
