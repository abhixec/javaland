

public class SetZeros {
	public static void setZeros(int[][] matrix){
		int[] row=new int[matrix.length];
		int[] column= new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=1;
					column[j]=1;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]==1 || column[j]==1){
					matrix[i][j]=0;
				}
			}
		}
	}
	public static void main(String args[]){
		int[][] test={{1,3,4,4},
					  {2,3,0,4},
					  {0,2,4,5}};
		
		setZeros(test);
		for(int i=0;i<test.length;i++){
			for(int j=0;j<test[0].length;j++){
				System.out.println(test[i][j]);
			}
		}
	}

}
