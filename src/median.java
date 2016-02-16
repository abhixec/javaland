
public class median {
	public int[] merge(int[] a1, int[] a2){
		int length=a1.length+a2.length;
		int[] final_array=new int[length];
		int i=0, j = 0,k=0;
		while(i <= a1.length && j<=a2.length){
		    if(a1[i] > a2[j]){
		        final_array[k]=a1[i];
		        i++;
		        k++;
		     }
		    final_array[k]=a2[j];
		    j++;
		    k++;
		}
		while(i!=a1.length){
		    final_array[k]=a1[i];
		    i++;
		    k++;
		}
		while(j!=a2.length){
		    final_array[k]=a2[j];
		    j++;
		    k++;
		}
		return final_array;
		}

		public int median(int[] array1,int[] array2){

		    int[] array3=merge(array1,array2);
		    int median=array3.length/2;
		    if(median %2 == 0){
		    int average=array3[median]+array3[median+1]/2;
		    return array3[average+1];
		    }
		    return array3[median];
		}
		public static void main(String arg[]){
			int[] a={1,2,3,4};
			int median=a.length/2;
			System.out.println(median);
			if(median %2==0){
				float average=(a[median]+a[median-1]);
				System.out.println(average/2);
			}
			System.out.println(a[median]);
		}
		
		// 1,2,3,4
}
