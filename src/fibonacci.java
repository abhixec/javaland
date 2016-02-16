
public class fibonacci {
	
	public static void fibonacci(int n){
		int a=0,b=1,i=0,c;
		while(i <=n){
			System.out.println(a+" "+ b);
			c=b;
			b=a+b;
			a=c;
			i++;
		}
	}
	
	//recursion
	public static int fib(int n){
		if(n <=1){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
	public static int fib_it(int n){
		int a=0,b=1,c=1;
		for(int i=0;i<n;i++){
			System.out.println(a + " " + b);
			a=b;
			b=c;
			c=a+b;
			
			
		}
		return a;
	}
	public static void main(String args[]){
		fibonacci(8);
		System.out.println(fib(8));
		System.out.println(fib_it(8));
	}
}
