package leetcode0_50;
/**
 * 返回最长公共子串(字符)前缀
 * @author xx
 * A.indexof(B)方法，从A中返回子串B最先出现位置（0最左边）,无则返回-1；
 * LCP(S1​…Sn​)=LCP(LCP(LCP(S1​,S2​),S3​),…Sn​)
 * 时间复杂度：O(S)，S 是所有字符串中字符数量的总和。
 * 空间复杂度：O(1)，我们只需要使用常数级别的额外空间。

 */
public class T14 {
	public String longestCommonPrefix(String[] strs) {
		if(strs.length==0 || strs==null)return "";
		String prefix = strs[0];
		for(int i=1;i<strs.length;i++) {
			//对每一个字符串进行前缀匹配
			while(strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.length()==0)return "";
			}
		}
		return prefix;
	}
	public static void main(String [] args) {
		String [] strs= {"leetccc","leetcode1","leetcd","leetco"};
// 		System.out.println(strs[0]);
// 		System.out.println("acbbcdj".indexOf("bbc"));
// 		System.out.println(strs[1].indexOf(strs[3]));
		System.out.println(new T14().longestCommonPrefix(strs));
	}
}
