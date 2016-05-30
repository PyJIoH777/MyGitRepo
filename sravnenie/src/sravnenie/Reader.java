package sravnenie;
import java.util.Scanner;

public class Reader {
static int i;
static int k;
static int a;


public static void main(String args[]){
	System.out.println("start");
System.out.println("give me number 1");
	Scanner scn = new Scanner(System.in);
	i = scn.nextInt();
	System.out.println("give me number 2");
	k = scn.nextInt();
	System.out.println("give me number 3");
	a = scn.nextInt();
	
	if (i > k && i > a)
		System.out.println("самое большое число- первое");
	else 
		System.out.println("самое большое число- не первое");
	
}


}
