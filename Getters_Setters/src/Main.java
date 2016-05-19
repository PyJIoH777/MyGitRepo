
public class Main {

	public static void main(String[] args) {
		Birds bird1 = new Birds();
		
		bird1.setCanFly(true);
		bird1.setName("Синица");
		
		System.out.println(bird1.getName());
		System.out.println(bird1.isCanFly());

	}

}
