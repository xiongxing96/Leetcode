package leetcode0_50;
/**
 * ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ�����������Σ������Ƴ���������³��ȡ�
 * ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
 * @author xx
 *
 */
public class T80 {
	 public int removeDuplicates(int[] nums) {
	        if(nums == null)
	            return 0;
	        if(nums.length <= 2)
	            return nums.length;
	        int i=1,j=2;
	        while(j<nums.length){
	            //���Ϊ2�����ж�
	            if(nums[i-1]==nums[j]){
	                j++;
	            }else{
	                nums[++i] = nums[j++];
	            }
	        }
	        return i+1;
	    }
}
