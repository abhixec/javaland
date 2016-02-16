
public class Collection {

	public static void test(String a) throws Exception{
		if(a.equals("test")){
			System.out.println("equal");
		}
		else{
			throw new Exception("please retry");
		}
	}
	public static String strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();   
        if(len1 < len2) return null;
        if(len2 == 0) return haystack;
        for(int i = 0; i <= len1 - len2; i++){
            if(haystack.substring(i, i+len2).equals(needle)){
            	System.out.println(haystack.substring(i,i+len2));
                return haystack.substring(i);
            }
        }
        return null;
    }
	
	/**
	 * @param args
	 */
	public static void main(String args[]){
		/*try {
			test("rest");			
		}
		catch(Exception e){
			System.out.println(e);
		}*/
		System.out.println(strStr("Testingtest","in"));
		System.out.println("tes".substring(2));
	}
}