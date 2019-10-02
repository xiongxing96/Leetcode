package leetcode0_50;

import java.util.*;


/**
 * ����ظ� �Ӵ�����
 * @author xx
 *
 */


/*
 * ������
 */
public class LongestSub {
	public static Queue<Character> delet(Queue<Character> q, char c) {
		while((char)q.poll() != c) {
		}
		return q;
	}
	public static int lengthOfLongestSubstring(String s) {
		int maxlen = 0;
		//���ո��ַ�����1
		if(s.equals(" "))
			return 1;
		//���е�ʹ��
		Queue<Character> queue = new LinkedList<Character>();
		for(int i=0;i<s.length();i++){
			if(queue.contains(s.charAt(i))){
				queue = delet(queue,s.charAt(i));
			}
			queue.add(s.charAt(i));
			if(queue.size() > maxlen) {
				maxlen = queue.size();
			}
			
		}
		return maxlen;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
}
	

