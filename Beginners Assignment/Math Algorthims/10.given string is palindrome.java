import java.util.*;

public class first {

	public static void main(String ...args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.print(isString(s));
		
		
	}public static boolean isString(String s) {
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}	
}
