import java.util.*;

public class first {

	public static void main(String ...args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a^=b;
		b^=a;
		a^=b;
		System.out.printf("%d %d",a,b);
		
		
	}
}
