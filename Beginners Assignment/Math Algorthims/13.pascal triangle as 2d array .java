import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int dp[][]=new int[n+1][n+1];
		for(int i=0;i<n+1;++i) {
			for(int j=i;j>0;--j) {
				if(i==j||j==0)dp[i][j]=1;
				else dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
	}
}
