package leetcode0_50;
/**
 * �±���ɷ�
 * @author xx
 *
 */
public class T6 {
	 public String convert(String s, int numRows) {
		if(numRows == 1)return s;//����Ϊ1ֱ�ӷ���
		String ret="";
	    int step = 2*numRows -2 ;//ѭ����
	    int index = 0;
	    int add = 0;
	    int len = s.length();
	    for(int i=0;i<numRows;i++) {
	    	index = i;//�±�����
	    	add = i*2;//���
	    	while (index < len)//�����ַ������ȼ�����һ��
			{
				ret += s.charAt(index); // ��ǰ�еĵ�һ����ĸ
				add = step - add;// ��һ�μ����step-2*i���ڶ�����2*i, 
				index += (i == 0 || i == numRows-1) ? step : add; // 0�к����һ��ʹ��step��࣬����ʹ��add���
			}
	    }
	    return ret;
	 }
	 public static void main(String[] args) {
		 System.out.println(new T6().convert("LEETCODEISHIRING", 4));
	 } 
}
