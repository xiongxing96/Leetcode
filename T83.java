package leetcode0_50;
/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @author xx
 *
 */
public class T83 {

	  public class ListNode {
	      int val;
	     ListNode next;
	      ListNode(int x) { val = x; }
	 }
	 
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode p = head;
	        while(p!=null && p.next!=null){
	            if(p.val == p.next.val){
	                p.next=p.next.next;
	            }else{
	                p=p.next;
	            }
	        }
	        return head;
	    }
}
