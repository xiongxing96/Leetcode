package leetcode0_50;
/**
 * ����������Ӵ�
 */
import Palindrome_string.Solution2;

public class T5 {
	//������չ���Ĵ���������Ӵ�
		public String findPalindrome(String s, int left, int right) {  
	        int n = s.length();  
	        int l = left;  
	        int r = right;  
	        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {  //���ܰ����н�������ж������У���������ս��
	            l--;  
	            r++;  
	        }  
	        //int m=l+1;
	        //System.out.println("l:"+m +"  and r:"+r);
	        return s.substring(l + 1, r);  //substring(begin,end)����������ĸΪ0�� ��begin��ʼ��endǰһ��
	        //��һ��Ϊ������0
	    }  
		//Ѱ��������Ӵ�����
	    public String longestPalindrome(String s) {  
	        int n = s.length();  
	        if (n<=1) return s;  
	  
	        String longest = "";  
	  
	        String str; 
	        for (int i=0; i<n-1; i++) { 
	        	//����������
	            str = findPalindrome(s, i, i);  
	            if (str.length() > longest.length()){  
	                longest = str;  
	            }  
	            //ż��������
	            str = findPalindrome(s, i, i + 1);  
	            if (str.length() > longest.length()){  
	                longest = str;  
	            }  
	        }  
	        return longest;  
	    }  
	    //main����
	    public static void main(String[] args) {
	    	Solution2 so = new Solution2();
	    	System.out.println(so.longestPalindrome("abbbbcdd"));
	    	//System.out.println("afhgsgdjk".substring(1,3));
	    }
}
