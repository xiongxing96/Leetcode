package leetcode0_50;
/*
 * ����ʵ���������
 */
public class T2 {
	 class ListNode {
	       int val;
	       ListNode next;
	       ListNode(int x) { val = x; }//���캯��
	   }
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	    //����ͷ�ڵ�
        ListNode root=new ListNode(0);
        //ʹβ�ڵ�ָ��ͷ�ڵ�
        ListNode rear=root;
        //����һ����ʼ��λ
        int carry=0;
        if (l1==null)
            return l2;
        if(l2==null)
            return l1;
        while((l1!=null)&&(l2!=null))
        {
            int rem=(l1.val+l2.val+carry)%10;//�Ӻ�ʣ��λ
            ListNode node=new ListNode(rem);//��ʣ��λ�������ڵ�
            rear.next=node;
            carry=(l1.val+l2.val+carry)/10;//�����λ
            //rearʼ��ָ�����һ���ڵ�
            rear=node;
            l1=l1.next;
            l2=l2.next;     
        }
        // ������������l1����l2�ж������ֱ�ӷŵ����档
        if (l1==null)
            rear.next=l2;
        else
            rear.next=l1;
        //������껹�н�λ�����û�н�λ��carry���������λ0������1��˵���н���Ȼ���λ���ں����һ��ֵ+1�����ж��Ƕ��н�λ
        if (carry==1)
        {
            while(rear.next!=null)
            {
                int sum=(rear.next.val+carry);
                rear.next.val=sum%10;
                
                carry=sum/10;
                rear=rear.next;
            }
                
        //�������н�λ
            if (carry==1)
            {
                rear.next=new ListNode(1);
            }
        }
        return root.next;    
    }
}
