import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((isprime(n))) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
	}
	public static boolean isprime(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0)return false;
		}
		return true;
	}

}
