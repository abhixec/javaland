import java.util.HashMap;
import java.util.HashSet;


public class repeating_seq {
	public static void recurse(int m){
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		int num=1;
		int remainder;
		int number;
		
		while(num < m){
			num=num*10;
			number=num/m;
			remainder=num%m; 
			num=remainder;
			
			//System.out.println(number);
			//System.out.println(remainder);
			if(hs.containsKey(number)){
				hs.put(number,hs.get(number)+1);
				System.out.println(number);
				break;
			}
			else{
				hs.put(number, 1);
			}
			
		}
		
		
	}
public static void main(String args[]){
	recurse(7);
}
}
