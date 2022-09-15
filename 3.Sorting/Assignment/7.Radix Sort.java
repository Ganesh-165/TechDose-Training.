import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			max=Math.max(max, arr[i]);
		}
		radixsort(arr,max,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void radixsort(int arr[],int max,int n) {
		
		for(int p=1;max/p>0;p*=10) {
			countsort(arr,p,n);
		}
	}
	public static void countsort(int arr[],int p,int n) {
		int temp[]=new int[n+1];
		int freq[]=new int[10];
		for(int i=0;i<n;i++) {
			freq[(arr[i]/p)%10]++;
		}
		for(int i=1;i<10;i++) {
			freq[i]+=freq[i-1];
		}
		for(int i=n-1;i>=0;i--) {
			temp[freq[(arr[i]/p)%10]-1]=arr[i];
			freq[(arr[i]/p)%10]--;
		}
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
	}
}
