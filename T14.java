package leetcode0_50;
/**
 * ����������Ӵ�(�ַ�)ǰ׺
 * @author xx
 * A.indexof(B)��������A�з����Ӵ�B���ȳ���λ�ã�0����ߣ�,���򷵻�-1��
 */
public class T14 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0 || strs==null)return "";
		String prefix = strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.length()==0)return "";
			}
		}
		return prefix;
	}
	public static void main(String [] args) {
		String [] strs= {"leetccc","leetcode1","leetcd","leetco"};
		System.out.println(strs[0]);
		System.out.println("acbbcdj".indexOf("bbc"));
		System.out.println(strs[1].indexOf(strs[3]));
		System.out.println(new T14().longestCommonPrefix(strs));
	}
}
