import java.util.*;



public class Strm {

	
	public static String reverse_word(String word){
		char[] w=word.toCharArray();
		char ns[]= new char[w.length];
		for(int i=0,j=w.length-1;i<w.length && j>=0;i++,j--)
		{
			 System.out.println(w[j]);
			 ns[i]=w[j];
		}
		return ns.toString();
	}
	public static String reverse_words_in_sentence(String sentence){
		StringBuilder reverse_sentence=new StringBuilder();
		System.out.println(sentence.length());
		int start=0,end;
		for(int i=0;i<sentence.length();i++){
			
			System.out.println("Char at" + i +" th position : "+sentence.charAt(i));
			if(sentence.charAt(i)== ' ' ||  i==sentence.length()-1){
				end=i;
				//System.out.println("Start" + start +"end"+ end);
				reverse_sentence.append(reverse_word(sentence.substring(start,end+1)));
				reverse_sentence.append(" ");
				start=end;
			}
		}
		
		return reverse_sentence.toString();
	}
	public static void main(String arg[]){
		/*String reversed_sentence=reverse_words_in_sentence("test me");
		System.out.println(reversed_sentence);
		reverse_word("test");*/
		
		String s="test this is cool"
				,t="sett";
		
		StringTokenizer st=new StringTokenizer(s);
		System.out.println(st);
		String[] str =new String[st.countTokens()];
		int i=0;
		while(st.hasMoreTokens()){
			//System.out.println(st.nextToken());
			str[i]=st.nextToken();
			i++;
		}
		for(int j=str.length-1;j>=0;j--){
			System.out.println(str[j]);
		}
		System.out.println();
	}
}
