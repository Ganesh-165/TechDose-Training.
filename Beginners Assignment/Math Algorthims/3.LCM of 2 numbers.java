import java.util.*;

public class first {

	public static void main(String ...args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		System.out.print((n*b)/gcd(n,b));
		
	}public static int gcd(int a,int b) {
		if(a==0)return b;
		return gcd(b%a,a);
	}
	
}
