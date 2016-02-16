
public class oddeen {
public static int[] oddoreven(int[] a){
	
	int i=0;
	int j=a.length-1;
	while(i <j){
		while(a[i]%2 ==0 && i<j){
			i ++;
		}
		while(a[j]%2==1 && i<j){
			j--;
		}
		if(i<j){
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	return a;
}
public static void main(String a[]){
	int[] arr={1,2,3,4,5,6,7,8};
	arr=oddoreven(arr);
	for(int i=0;i<arr.length;i++){
		System.out.println(arr[i]);
	}
}
}
