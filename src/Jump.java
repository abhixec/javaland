
public class Jump {
	
	    public static boolean canJump(int[] A) {
	    	//[2,3,1,4]
	        if(A.length <= 1) return true;
	        int i = A.length-1;
	        while(i >= 0){
	        	System.out.println("i  "+i);
	            int j = i-1;
	            while(j >= 0){
	            	//System.out.println("i : "+i+" j : "+j + " a[j] "+ A[j] + " i-j "+(i-j));
	                if(A[j] >= i-j){
	                    i = j;
	                    System.out.println("print a[j] "+ A[j]);
	                    System.out.println("Print i "+i);
	                    System.out.println("print j "+j);
	                    System.out.println("-------");
	                    break;
	                }
	                
	                else{ 
	                	System.out.println("j >> "+ j);
	                	j--;
	            
	                }   
	            }
	            if(j == 0) return true;
	            if(j == -1) return false;
	        }
	        return true;
	    }

	public static void main(String args[]){
		int ar[]={2,3,1,4};
		System.out.println(canJump(ar));
	}
}
