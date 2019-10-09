package leetcode0_50;
/**
 * N皇后问题
 * 不能同行、同列、同 一对角线
 * 回溯法
 * @author xx
 *
 */

import java.awt.image.renderable.RenderableImage;
import java.util.ArrayList;
import java.util.List;
/*
public class T51 {
	//初始化棋盘点阵
	public List<List<String>> solveNQueens(int n){
		char [][] chs = new char [n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				chs[i][j] = '.';
			}
		}
		List<List<String>>res = new ArrayList<>();//设置结果集
		backTracing(chs, 0, n, res);//从第一行开始回溯
		return res;//返回结果集
	}
	//将每行的位置转化为String类型放入list
	public List<String> chsToList(char[][] chs){
		List<String> list = new ArrayList<>();
		for(int i=0;i<chs.length;i++) {
			list.add(new String(chs[i]));
		}
			return list;
	}
	//回溯法
	public void backTracing(char[][] chs, int row,int n,List<List<String>> res) {
		if(row == n) {//每行都摆满皇后时，则产生了一种解法
			res.add(chsToList(chs));//将最终结果放入结果集res
			return;
		}
		//按列处理
		for(int col = 0;col<chs[0].length;col++) {
			if(isValid(chs,row,col)) {//如果该位置有效则放置Q
				chs[row][col] = 'Q';
				backTracing(chs, row+1, n, res);//继续向下一行递归
				chs[row][col] = '.';
			}
		}
	}
	
	//判断下当前位置(x,y)下的皇后是否为有效
	public boolean isValid(char[][] chs,int x,int y) {
		for(int i=0;i<x;i++) {//不超过当前行
			for(int j=0;j<chs[0].length;j++) {//已经确定每行放置一个Q,只要列不同以及不同对角线即可
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
