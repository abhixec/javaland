import java.util.Arrays;


public class SortingAlgorithms {
	public static int[] insertion_sort(int[] a){
		int j;
		for (int i=1; i < a.length;i++){
		//	int value=a[i];
			j=i-1;
			while(j>=0){
//				if(a[j]>value){
//					a[j+1]=a[j];
//					a[j]=value;
//					j--;
//					
//				}
				if(a[j]>a[i]){
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					i--;
					j--;
					System.out.println("i : "+ i +"j :"+j);
				}
				else{
					break;
				}
			}
			
		}
		return a;
	}
	public static int[] merge(int[] a,int[] b){
		int length=a.length+b.length;
		int[] c=new int[length];
		int i=0;
		int j=0;
		
		int k=0;
		while (i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k]=a[i];
				i++;
			}
			else if(a[i]>b[j]){
				c[k]=b[j];
				j++;
			}
			k++;
		}
		while(i<a.length){
			c[k]=a[i];
			i++;
			k++;
			
		}
		while(j<b.length){
			c[k]=a[j];
			j++;
			k++;
			
		}
		return c;
	}
	public static int[] insertionSort1(int a[]){
		for (int i =1; i<a.length;i++){
			for(int j=i-1;j >=0 && i>0 ; j--,i--){
				if(a[j]>a[i]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
				else{
					break;
				}
			}
		}
		return a;
	}
	public static int partition(int arr[], int left, int right)
	{
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	     
	      while (i <= j) {
	            while (arr[i] < pivot)
	                  i++;
	            while (arr[j] > pivot)
	                  j--;
	            if (i <= j) {
	                  tmp = arr[i];
	                  arr[i] = arr[j];
	                  arr[j] = tmp;
	                  i++;
	                  j--;
	            }
	      };
	     
	      return i;
	}
	public void quickSort(int[] arr,int left,int right){
		
		int index = partition(arr, left, right);
	      if (left < index - 1)
	            quickSort(arr, left, index - 1);
	      if (index < right)
	            quickSort(arr, index, right);
	}
	
	public static int[] mergeSort1 (int[] data) {
		   if (data.length == 1)
		      return data;
		   int middle = data.length / 2;
		   int[] left = mergeSort1(Arrays.copyOfRange(data, 0, middle - 1));
		   int[] right = mergeSort1(Arrays.copyOfRange(data, middle, data.length - 1));
		   int[] result = new int[data.length];
		   int dPtr = 0;
		   int lPtr = 0;
		   int rPtr = 0;
		   while (dPtr < data.length) {
		      if (lPtr == left.length) {
		         result[dPtr] = right[rPtr];
		         rPtr++;         
		      } else if (rPtr == right.length) {
		         result[dPtr] = left[lPtr];
		         lPtr++;
		      } else if (left[lPtr] < right[rPtr]) {
		         result[dPtr] = left[lPtr];
		         lPtr++;
		      } else {
		         result[dPtr] = right[rPtr];
		         rPtr++;         
		      }
		      dPtr++;
		   }
		   return result;
		}
	 public static int[] mergeSort(int array[])  {
		 	if(array.length > 1)  	{
		 		int elementsInA1 = array.length/2;
		 		int elementsInA2 = array.length - elementsInA1;
		 		int arr1[] = new int[elementsInA1];
		 		int arr2[] = new int[elementsInA2];
		 		
		 		for(int i = 0; i < elementsInA1; i++)
		 			arr1[i] = array[i];

		 		for(int i = elementsInA1; i < elementsInA1 + elementsInA2; i++)
		 			arr2[i - elementsInA1] = array[i];

		 		arr1 = mergeSort(arr1);
		 		arr2 = mergeSort(arr2);
		 		
		 		int i = 0, j = 0, k = 0;

		 		while(arr1.length != j && arr2.length != k) {
		 			if(arr1[j] <= arr2[k]) {
		 				array[i] = arr1[j];
		 				i++;
		 				j++;
		 			} else {
		 				array[i] = arr2[k];
		 				i++;
		 				k++;
		 			}
		 		}

		 		while(arr1.length != j) {
		 			array[i] = arr1[j];
		 			i++;
		 			j++;
		 		}
		 		while(arr2.length != k) {
		 			array[i] = arr2[k];
		 			i++;
		 			k++;
		 		}
		 	}
		 	return array;
		 }
//	 public static void heapsort(int a[]){
//		 Heap h = new Heap();
//		 for (int i = 0; i < data.Length; i++)
//		    h.Add(data[i]);
//		 int[] result = new int[data.Length];
//		 for (int i = 0; i < data.Length; i++)
//		    data[i] = h.RemoveLowest();
//	 }
	 public static int[] bubblesort(int a[]){
		 for(int i =a.length-1;i>0;i--){
			 for(int j=0;j<i;j++){
				 
				 if(a[j]>a[j+1]){
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 
					 
				 }
			 }
		 }
		 return a;
		 
	 }
	public static void main(String argv[]){
		int[] a={35,10,3,5,20,1};
		int[] b={1,9,2,4,22,30};
		int[] d=mergeSort(b);
		//a=insertion_sort(a);
		//b=insertionSort1(b);
		//a=merge(a,b);
		//b=mergeSort(b);
		/*for (int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}*/
		int [] c=mergeSort(a);
		//int[] c=bubblesort(a);
		for (int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
//		for (int i=0;i<b.length;i++){
//			System.out.println(b[i]);
//		}
	}
	
}
