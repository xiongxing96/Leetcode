package leetcode0_50;

/**
 * ȥ������Ԫ�أ��������鳤��
 * O(1)�ռ临�Ӷ�
 * @author xx
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 */
public class T27 {
	public int removeElement(int[] nums, int val) {
		int i=0;
		for(int j=0;j<nums.length;j++) {
			if(nums[j]!=val) {
				nums[i]=nums[j];
				i++;
			}
		}
		return i;
	}
	public static void main(String[] args) {
		int [] nums = {1,2,3,3,4,5,6};
		System.out.println(new T27().removeElement(nums, 3));
	}
}
