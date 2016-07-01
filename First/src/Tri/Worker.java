package Tri;

public class Worker{
	int a;
	int b;
	static String g;
	
	public  Worker(int a, int b){
		this.a = a;
		this.b = b;
		anilizer();
	}
	enum Tip { RECTANGLE777, SQUARE777 }
	
	public void anilizer(){
		
		if (a == b){  
		setType(Tip.SQUARE777);}
		else {setType(Tip.RECTANGLE777);}
	}

	public void setType(Tip rrr) {
		g = rrr.name();	
	}
	public String getType(Tip rrr) {
		return g;	
	}
	
	
}