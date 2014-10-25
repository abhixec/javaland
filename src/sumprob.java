import java.util.HashSet;


public class sumprob {
public static void main(String args[]){
	int[] test={10,1,3,4,5,9,12};
	HashSet<Integer> hs=new HashSet<>();
	for(int i=0;i<test.length;i++){
		hs.add(test[i]);
	}
	int sum=13;
	int diff;
	
	for(int i=0;i<test.length;i++){
		diff=sum -test[i];
		System.out.println(test[i]);
		if(hs.contains(diff)){
			System.out.println("sum exists the numbers are:"+ test[i] + " " + diff);
			
		}
	}
	
}

}
