package Tri;

import java.util.Scanner;

public class Main  {
	public static int i;
	public static int k;
	
	public static void main(String [] args){
		System.out.println("Starting!");
		Scan();
		//Figura myFigura = new Figura(i,k);
		Worker Fig = new Worker(i,k);
		System.out.println("Figure created");
		//System.out.println(myFigura.getType());
		System.out.println(Worker.g);
	}
	
	public static void Scan(){
		System.out.println("give me number 1");
			Scanner scn = new Scanner(System.in);
			i = scn.nextInt();
			System.out.println("give me number 2");
			k = scn.nextInt();
			scn.close();
		}
}