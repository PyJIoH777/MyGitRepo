package thread_random;

public class Thrd {

		public static void main(String[] args){
			Thread t1 = new Thread(new secondclass("1"));
			Thread t2 = new Thread(new secondclass("2"));
			Thread t3 = new Thread(new secondclass("3"));
			t1.start();
			t2.start();
			t3.start();
		}
}
