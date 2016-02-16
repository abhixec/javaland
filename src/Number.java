
public class Number {
	public static int reverse_number(int n){
		int x=0;
		int y=n;
		while(y != 0){
			x=x*10+y%10;
			y=y/10;
		}
		return x;
	}
	public static void main(String arg[]){
		int number=12121;
		int reverse=reverse_number(number);
		System.out.println(reverse);
		if(reverse == number){
			System.out.println("Number is palindrome");
		}
	}
}
