package Tri;

public class Figura {

	int a;
	int b;
	String myType;

	public Figura(int a, int b) {
		this.a = a;
		this.b = b;
		defType();
		System.out.println(a + b);
	}
	
	enum Type {
		SQUARE, RECTANGLE
	};

	public String getType() {
		return myType;
	}

	private void setType(Type typeToSet1) {
		myType = typeToSet1.name();
	}
	

	public void defType() {
		if (a == b) {
			setType(Type.SQUARE);
		} else {
			setType(Type.RECTANGLE);
		}
		System.out.println("Type recognized");
	}

}


