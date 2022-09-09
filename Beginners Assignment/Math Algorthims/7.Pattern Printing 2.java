import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}




/*
pattern 


5 4 3 2 1
5 4 3 2 
5 4 3
5 4
5
*/
