
public class UniqueCharacter {
public static boolean isunique(String str){
	boolean[] char_set=new boolean[256];
	for(int i=0; i <str.length();i++){
		int val=str.charAt(i);
		System.out.println(val);
		if(char_set[val])return false;
		char_set[val]=true;
	}
	return true;
}
public static void main(String args[]){
	String a="abhinav";
	System.out.println(isunique(a));
}
}
