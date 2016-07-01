package allweek;

public class Days {

	int t;
	static String whatday;
	
	public Days(int i) {
		this.t = i;
		   anilizer();
	}

enum D{ MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

	public void anilizer() {
		if (t == 1) {  setD(D.MONDAY)         ;}
		else if (t == 2) {  setD(D.TUESDAY)    ;}
		else if (t == 3) {  setD(D.WEDNESDAY)    ;}
		else if (t == 4) {  setD(D.THURSDAY)    ;}
		else if (t == 5) {  setD(D.FRIDAY)    ;}
		else if (t == 6) {  setD(D.SATURDAY)    ;}
		else if (t == 7) {  setD(D.SUNDAY)    ;}
		else {  System.out.println("Wrong day");    ;}
		
	}
	
	private void setD(D ddd) {
		whatday = ddd.name();
			
	}

	public String getDay(){
		return whatday;
		
	}
	
}
