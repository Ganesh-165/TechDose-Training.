import java.util.*;
public class first {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		qsort(arr,0,n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	public static void qsort(int arr[],int s,int e) {
		if(s<e) {
			int p=parttion(arr,s,e);
			qsort(arr,s,p-1);
			qsort(arr,p+1,e);
		}
	}
	public static int parttion(int arr[],int s,int e) {
		int i=s-1;
		int p=arr[e];
		for(int j=s;j<e;j++) {
			if(arr[j]<p) {
				i++;
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
		int temp=arr[e];
		arr[e]=arr[i+1];
		arr[i+1]=temp;
		return (i+1);
	}
}
