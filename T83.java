package leetcode0_50;
/**
 * ����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�
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
