package leetcode0_50;

import java.util.*;

/**
 * javaʵ������ȡ��
 * @author xx
 *
 */
public class Solution {
	public final static int MAXN = 10;
	public static int N;
	public static int [] data = new int[MAXN];
	public static int [] sum = new int[MAXN];
	public static int [][] gain = new int [MAXN][MAXN];
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();
		N = n;
		int t=0;
		while(n!=0) {
			data[t++] = input.nextInt();
			sum[t] = sum[t-1]+data[t];
			gain[t][t] = data[t];
			n--;
			t++;
		}
		for(int i = N-1; i > 0; i--)
		for(int j = i; j <= N; j++ ) {
			gain[1][N] = sum[j]-sum[i-1]-Math.min(gain[i+1][j], gain[i][j-1]);
		}
		System.out.println(gain[1][N]);
		System.out.println(sum[N]-gain[1][N]);
	}
}
