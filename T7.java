package leetcode0_50;
/**
 * �з���������ת
 * ��ֹ���32λ
 * -2^31 < y < 2^31-1
 * @author xx
 *
 */
public class T7 {
	public int reverse(int x) {
		int ans = 0;
		while(x != 0) {
			int pop = x % 10;//��¼���һλ����
			if(ans > Integer.MAX_VALUE/10 || (ans == Integer.MAX_VALUE/10 && pop> 7))//��ת������һλ
				return 0;
			if(ans < Integer.MIN_VALUE/10 || (ans == Integer.MIN_VALUE/10 && pop<-8))//��ת������һλ
				return 0;
			ans = ans * 10 + pop;	
			x /= 10;
		}
		return ans;
	}
	public static void main(String[] args) {
		System.out.print(new T7().reverse(-123));
	}
}
