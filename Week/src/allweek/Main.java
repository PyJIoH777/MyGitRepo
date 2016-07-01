package allweek;
import java.util.Scanner;

public class Main {

	    static int i;
	    
		public static void main(String [] args){
			System.out.println("Starting!");
			Scan();
			Days day = new Days(i);
			
			System.out.println(Days.whatday);
			
			
		}
		
		public static void Scan(){
			System.out.println("give me the number of day");
			Scanner scn = new Scanner(System.in);
			i = scn.nextInt();
				scn.close();
				System.out.println("your day is " + i);
			}
	}

