
public class data {
 public static void main(String args[]){
	Ints intas = new Ints();
	intas.Intess();
	intas.a = Count(intas.a);
	intas.b = Count(intas.b);
	System.out.println(intas.a);
	System.out.println(intas.b);
 }
 public static int Count(int x){
	x = x +1; 
	 return x;
 }
}