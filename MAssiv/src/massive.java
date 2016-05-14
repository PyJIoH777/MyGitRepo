
public class massive {
 public static void main(String args[]){
	 int[][] m = {{2,5,8,6},{2,3,6,5},{0,3,7,2}};
	 
	 for(int row=0;row<m.length;row++){
		 for(int col=0;col<m[row].length;col++);{
				System.out.print(m[row][col] + "  "); 
	 }
	 System.out.println();
 }
}
}