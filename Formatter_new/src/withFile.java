import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class withFile {
	
static Formatter x;
static Scanner scn;

	public static void main(String[] args){
		try{
			x = new Formatter("res//1.txt");
			scn = new Scanner(System.in);
			System.out.println("age");
			int a = (int)Double.parseDouble(scn.next());
			//если введем число с точкой- он выкинет все за точкой 
			//и переведет в целое число
			//или можно написать int a = scn.nextInt(); 
			System.out.println("place");
			String t = scn.next();
			
			x.format("mne %d let, Ya jivu v gorode %s. \n", a,t);
			x.close();
		}catch(Exception e){JOptionPane.showMessageDialog(null, "Файл не найден");};
			
	}
}
