import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int dp[]=new int[n+1];
		for(int i=0;i<n+1;++i) {
			for(int j=i;j>0;--j) {
				if(i==j||j==0)dp[j]=1;
				else dp[j]=dp[j-1]+dp[j];
				System.out.print(dp[j]+" ");
			}
			System.out.println();
		}
		System.out.print(dp[b]);
	}
}
