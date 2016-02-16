
public class ReverseNumber {

	
	public static void main(String args[]){
		int[][] arr=new int[][]{
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		int i=0,j=0;
		int a=1234;
		int reverse=0;
		int remainder=0;
		while(a>0){
			remainder=a%10;
			reverse=reverse*10+remainder;
			a=a/10;
		}

		System.out.println(reverse);
	}
}
