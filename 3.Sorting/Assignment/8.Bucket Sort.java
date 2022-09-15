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
		bucketsort(arr,max,n);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void bucketsort(int arr[],int max,int n) {
		int bucket[]=new int[max+1];
		for(int i=0;i<n;i++) {
			bucket[arr[i]]++;
		}
		for(int i=0,j=0;i<=max;i++) {
			while(bucket[i]>0) {
				arr[j++]=i;
				bucket[i]--;
			}
		}
	}
}
