package leetcode0_50;
/**
 * N�ʺ�����
 * ����ͬ�С�ͬ�С�ͬ һ�Խ���
 * ���ݷ�
 * @author xx
 *
 */

import java.awt.image.renderable.RenderableImage;
import java.util.ArrayList;
import java.util.List;
/*
public class T51 {
	//��ʼ�����̵���
	public List<List<String>> solveNQueens(int n){
		char [][] chs = new char [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chs[i][j] = '.';
			}
		}
		List<List<String>>res = new ArrayList<>();//���ý����
		backTracing(chs, 0, n, res);//�ӵ�һ�п�ʼ����
		return res;//���ؽ����
	}
	//��ÿ�е�λ��ת��ΪString���ͷ���list
	public List<String> chsToList(char[][] chs){
		List<String> list = new ArrayList<>();
		for(int i=0;i<chs.length;i++) {
			list.add(new String(chs[i]));
		}
			return list;
	}
	//���ݷ�
	public void backTracing(char[][] chs, int row,int n,List<List<String>> res) {
		if(row == n) {//ÿ�ж������ʺ�ʱ���������һ�ֽⷨ
			res.add(chsToList(chs));//�����ս����������res
			return;
		}
		//���д���
		for(int col = 0;col<chs[0].length;col++) {
			if(isValid(chs,row,col)) {//�����λ����Ч�����Q
				chs[row][col] = 'Q';
				backTracing(chs, row+1, n, res);//��������һ�еݹ�
				chs[row][col] = '.';
			}
		}
	}
	
	//�ж��µ�ǰλ��(x,y)�µĻʺ��Ƿ�Ϊ��Ч
	public boolean isValid(char[][] chs,int x,int y) {
		for(int i=0;i<x;i++) {//��������ǰ��
			for(int j=0;j<chs[0].length;j++) {//�Ѿ�ȷ��ÿ�з���һ��Q,ֻҪ�в�ͬ�Լ���ͬ�Խ��߼���
				if(chs[i][j] == 'Q'&&(j==y||Math.abs(x-i)==Math.abs(y-j))) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n=6;
		System.out.println(new T51().solveNQueens(n));
	}
	
}
*/
public class T51{
	public List<List<String>> solveNQueens(int n){
		char[][] chs = new char[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chs[i][j] = '.';
			}
		}
		List<List<String>>res = new ArrayList<>();
		backTracing(chs,0,n,res);
		return res;
	}

	public void backTracing(char[][] chs, int row, int n, List<List<String>> res) {
		if(row == n) {
			res.add(chsToList(chs));
			return;
		}
		for(int col=0;col<chs[0].length;col++) {
			if(isValid(chs,row,col)) {
				chs[row][col]='Q';
				backTracing(chs, row+1, n, res);
				chs[row][col] = '.';
			}
		}
	}
		
	public boolean isValid(char[][] chs, int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0;i<x;i++) {
			for(int j=0;j<chs[0].length;j++) {
				if(chs[i][j]=='Q'&&(j==y||Math.abs(i-x)==Math.abs(j-y))) {
					return false;
				}
			}
		}
		return true;
	}
	public List<String> chsToList(char[][] chs) {
		List<String> list = new ArrayList<>();
		for(int i=0;i<chs.length;i++) {
			list.add(new String(chs[i]));
		}
		return list;
	}
	public static void main(String[] args) {
		int n=4;
		System.out.println(new T51().solveNQueens(n));
	}
} 
