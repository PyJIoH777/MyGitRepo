package Tri;

public class Figura {

	int a;
	int b;
	String myType;

	public Figura(int a, int b) {
		this.a = a;
		this.b = b;
		defType();
	}
	
	enum Type {
		SQUARE, RECTANGLE
	};

	public String getType() {
		return myType;
	}

	private void setType(Type typeToSet) {
		myType = typeToSet.name();
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


