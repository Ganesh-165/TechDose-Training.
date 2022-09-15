import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int freq[]=new int[10];
		for(int i=0;i<n;i++) {
			freq[arr[i]]++;
		}
		int s=0;
		for(int i=0;i<10;i++) {
			if(freq[i]>0) {
				for(int j=1;j<=freq[i];j++) {
					arr[s++]=i;
				}
			}
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
