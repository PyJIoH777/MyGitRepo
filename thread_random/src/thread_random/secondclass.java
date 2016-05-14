package thread_random;

import java.util.Random;

class secondclass implements Runnable{
		int time;
		String name;
		Random r = new Random();
		
		
	public secondclass(String name){
		this.name = name;
		time = r.nextInt(555);
	}
	
	@Override
	public void run() {
		System.out.printf("Поток %s спит %d миллисекунд \n", name, time);
		try{
			Thread.sleep(time);
		}catch(Exception e){}
		System.out.printf("Поток %s проснулся и закончился\n", name);
		
		
	}

}
